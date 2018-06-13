package com.oracle.model;

import java.util.List;

public class Menu {
	private Integer id;
	private String text;
	private String url;
	private List<Menu> children;
	public Menu(Integer id, String text, String url, List<Menu> children) {
		super();
		this.id = id;
		this.text = text;
		this.url = url;
		this.children = children;
	}
	public Menu() {
		super();
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
	
}
