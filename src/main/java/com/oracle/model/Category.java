package com.oracle.model;

public class Category {
	private Integer id;
	private String catName;
	private String catCode;
	private Integer pid;
	private String addDate;
	private String updateDate;
	
	public Category() {
		super();
	}
	public Category(Integer id, String catName, String catCode, Integer pid, String addDate, String updateDate) {
		super();
		this.id = id;
		this.catName = catName;
		this.catCode = catCode;
		this.pid = pid;
		this.addDate = addDate;
		this.updateDate = updateDate;
	}
	public Category(String catName, String catCode, Integer pid) {
		super();
		this.catName = catName;
		this.catCode = catCode;
		this.pid = pid;
	}
	public Category(Integer id, String catName, String catCode, Integer pid) {
		super();
		this.id = id;
		this.catName = catName;
		this.catCode = catCode;
		this.pid = pid;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getCatCode() {
		return catCode;
	}
	public void setCatCode(String catCode) {
		this.catCode = catCode;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getAddDate() {
		return addDate;
	}
	public void setAddDate(String addDate) {
		this.addDate = addDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
}
