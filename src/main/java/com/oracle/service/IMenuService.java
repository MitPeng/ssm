package com.oracle.service;

import java.util.List;

import com.oracle.model.Menu;

public interface IMenuService {
	public List<Menu> findMenuByPid(Integer pid);
}
