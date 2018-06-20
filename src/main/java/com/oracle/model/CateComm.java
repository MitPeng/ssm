package com.oracle.model;

import java.util.List;

public class CateComm {
	private Integer id;
	private String name;
	private Integer pid;
	private List<CateComm> categoryList;
	
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
	public List<CateComm> getCategoryList() {
		return categoryList;
	}
	public void setCategoryList(List<CateComm> categoryList) {
		this.categoryList = categoryList;
	}
	
}
