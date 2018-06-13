package com.oracle.dao;

import java.util.List;

import com.oracle.model.Menu;

public interface IMenuDao {
	public List<Menu> findMenuByPid(Integer pid);
}
