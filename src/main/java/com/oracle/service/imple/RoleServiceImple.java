package com.oracle.service.imple;

import java.util.List;

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

}
