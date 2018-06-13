package com.oracle.dao;

import java.util.List;

import com.oracle.model.Role;

public interface IRoleDao {
	public List<Role> findRoleByUid(Integer id);
}
