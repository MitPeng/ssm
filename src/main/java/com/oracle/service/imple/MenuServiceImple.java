package com.oracle.service.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.dao.IMenuDao;
import com.oracle.model.Menu;
import com.oracle.service.IMenuService;

@Service("msi")
public class MenuServiceImple implements IMenuService {

	@Autowired
	private IMenuDao imd;
	
	@Override
	public List<Menu> findMenuByPid(Integer pid) {
		// TODO Auto-generated method stub
		return imd.findMenuByPid(pid);
	}

}
