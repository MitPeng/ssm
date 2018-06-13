package com.oracle.service;

import java.util.List;

import com.oracle.model.Role;

public interface IRoleService {
	public List<Role> findRoleByUid(Integer id);
}
