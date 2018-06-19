package com.oracle.service;

import java.util.List;
import java.util.Map;

import com.oracle.model.Menu;

public interface IMenuService {
	public List<Menu> findMenuByPid(Integer pid);
	public int addMenu(Menu m);
	public int updateMenuById(Menu m);
	public int deleteMenuById(Integer id);
	public List<Menu> findMenuPage(Map map);
	public Long findTotalSize();
}
