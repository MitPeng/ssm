package com.oracle.service;

import java.util.List;
import java.util.Map;

import com.oracle.model.Role;

public interface IRoleService {
	public List<Role> findRoleByUid(Integer id);
	public int addRole(Role r);
	public int addUserAndRole(Integer roleId,Integer userId);
	public Long findTotleSize();
	public List<Role> findRolePage(Map map);
	public Long findUserANdRole(Integer roleId,Integer userId);
	int deleteUserAndRoleByRid(Integer rid);
	int deleteRoleByRid(Integer rid);
}
