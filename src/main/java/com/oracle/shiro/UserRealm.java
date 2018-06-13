package com.oracle.shiro;

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

import com.oracle.model.User;
import com.oracle.service.IUserService;



public class UserRealm extends AuthorizingRealm {
	@Resource
    private IUserService usi;

    @Override
    // ⁄»®
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
    	String currentUsername = (String)super.getAvailablePrincipal(principals);
		List<String> roleList = null;
		List<String> permissionList = null;
//		User user = usi.findUserByUsername(currentUsername);
//		if(null != user){
//			permissionList = usi.getPermissions(user.getId());
//			roleList = usi.findRolesByUserId(user.getId());
//		}else{
//			throw new AuthorizationException();
//		}
		SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();
		simpleAuthorInfo.addRoles(roleList);
		simpleAuthorInfo.addStringPermissions(permissionList);
		return simpleAuthorInfo;
    }

    @Override
    //»œ÷§
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
			String phone = (String) token.getPrincipal();
			User user = usi.queryUserByPhone(phone);
			if (user == null) {
			    throw new UnknownAccountException();
			}else{
				ByteSource salt = ByteSource.Util.bytes(user.getSalt());
				SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user.getPhone(),
						user.getPassWord(),salt,getName());
//				System.out.println(authenticationInfo);
				SecurityUtils.getSubject().getSession().setAttribute("CURRENT_USER", user);
				return authenticationInfo;
			}
			
    }
    
    
    
}