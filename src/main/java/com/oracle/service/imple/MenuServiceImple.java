package com.oracle.service.imple;

import java.util.List;
import java.util.Map;

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

	@Override
	public int addMenu(Menu m) {
		// TODO Auto-generated method stub
		return imd.addMenu(m);
	}

	@Override
	public int updateMenuById(Menu m) {
		// TODO Auto-generated method stub
		return imd.updateMenuById(m);
	}

	@Override
	public int deleteMenuById(Integer id) {
		// TODO Auto-generated method stub
		return imd.deleteMenuById(id);
	}

	@Override
	public List<Menu> findMenuPage(Map map) {
		// TODO Auto-generated method stub
		return imd.findMenuPage(map);
	}

	@Override
	public Long findTotalSize() {
		// TODO Auto-generated method stub
		return imd.findTotalSize();
	}

}
