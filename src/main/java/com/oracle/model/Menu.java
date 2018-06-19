package com.oracle.model;

import java.util.List;

public class Menu {
	private Integer id;
	private String text;
	private Integer pid;
	private String url;
	private List<Menu> children;
	
	public Menu() {
		super();
	}
	public Menu(Integer id, String text, Integer pid, String url, List<Menu> children) {
		super();
		this.id = id;
		this.text = text;
		this.pid = pid;
		this.url = url;
		this.children = children;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<Menu> getChildren() {
		return children;
	}
	public void setChildren(List<Menu> children) {
		this.children = children;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "Menu [id=" + id + ", text=" + text + ", pid=" + pid + ", url=" + url + ", children=" + children + "]";
	}
	
}
