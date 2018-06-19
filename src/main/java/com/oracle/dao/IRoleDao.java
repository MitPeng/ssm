package com.oracle.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.oracle.model.Role;

public interface IRoleDao {
	public List<Role> findRoleByUid(Integer id);
	public int addRole(Role r);
	public int addUserAndRole(@Param("roleId") Integer roleId,@Param("userId") Integer userId);
	public Long findTotleSize();
	public List<Role> findRolePage(Map map);
	public Long findUserANdRole(@Param("roleId") Integer roleId,@Param("userId") Integer userId);
	int deleteUserAndRoleByRid(Integer rid);
	int deleteRoleByRid(Integer rid);
}
