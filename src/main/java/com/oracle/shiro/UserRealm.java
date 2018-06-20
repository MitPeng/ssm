package com.oracle.shiro;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.oracle.model.Role;
import com.oracle.model.User;
import com.oracle.service.IRoleService;
import com.oracle.service.IUserService;



public class UserRealm extends AuthorizingRealm {
	@Autowired
    private IUserService usi;
	@Autowired
	private IRoleService rsi;

    @Override
    //授权
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
    	String phone = (String)super.getAvailablePrincipal(principals);
		List<String> roleList = new ArrayList<String>();
//		List<String> permissionList = new ArrayList<String>();
		User user = usi.queryUserByPhone(phone);
		if(null != user){
//			permissionList = usi.getPermissions(user.getId());
			List<Role> roles = rsi.findRoleByUid(user.getId());
			if(null!= roles && roles.size()>0){
				//获取当前登录账号的角色权限
				for(Role r : roles){
					if(r!=null && !StringUtils.isEmpty(r.getRoleCode())){
						roleList.add(r.getRoleCode());
					}
				}
			}
		}else{
			throw new AuthorizationException();
		}
		SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();
		simpleAuthorInfo.addRoles(roleList);
//		simpleAuthorInfo.addStringPermissions(permissionList);
		return simpleAuthorInfo;
    }

    @Override
    //认证
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
			String phone = (String) token.getPrincipal();
			User user = usi.queryUserByPhone(phone);
			if (user == null) {
			    throw new UnknownAccountException();
			}else{
				ByteSource salt = ByteSource.Util.bytes(user.getSalt());
				SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user.getPhone(),
						user.getPassWord(),salt,getName());
				SecurityUtils.getSubject().getSession().setAttribute("CURRENT_USER", user);
				return authenticationInfo;
			}
			
    }
    
    
    
}