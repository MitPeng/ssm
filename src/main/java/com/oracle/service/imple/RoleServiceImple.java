package com.oracle.service.imple;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.dao.IRoleDao;
import com.oracle.model.Role;
import com.oracle.service.IRoleService;

@Service("rsi")
public class RoleServiceImple implements IRoleService {

	@Autowired
	private IRoleDao ird;
	
	@Override
	public List<Role> findRoleByUid(Integer id) {
		// TODO Auto-generated method stub
		return ird.findRoleByUid(id);
	}

	@Override
	public int addRole(Role r) {
		// TODO Auto-generated method stub
		return ird.addRole(r);
	}

	@Override
	public int addUserAndRole(Integer roleId, Integer userId) {
		// TODO Auto-generated method stub
		return ird.addUserAndRole(roleId, userId);
	}

	@Override
	public Long findTotleSize() {
		// TODO Auto-generated method stub
		return ird.findTotleSize();
	}

	@Override
	public List<Role> findRolePage(Map map) {
		// TODO Auto-generated method stub
		return ird.findRolePage(map);
	}

	@Override
	public Long findUserANdRole(Integer roleId, Integer userId) {
		// TODO Auto-generated method stub
		return ird.findUserANdRole(roleId, userId);
	}

	@Override
	public int deleteUserAndRoleByRid(Integer rid) {
		// TODO Auto-generated method stub
		return ird.deleteUserAndRoleByRid(rid);
	}

	@Override
	public int deleteRoleByRid(Integer rid) {
		// TODO Auto-generated method stub
		return ird.deleteRoleByRid(rid);
	}

}
