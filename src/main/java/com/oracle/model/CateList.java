package com.oracle.model;

import java.util.List;

public class CateList {
	private Integer id;
	private String name;
	private Integer pid;
	private List<CateList> categoryList;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public List<CateList> getCategoryList() {
		return categoryList;
	}
	public void setCategoryList(List<CateList> categoryList) {
		this.categoryList = categoryList;
	}
	
}
