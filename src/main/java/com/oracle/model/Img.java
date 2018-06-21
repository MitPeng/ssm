package com.oracle.model;

public class Img {
	private Integer id;
	private Integer commId;
	private String url;
	public Img(Integer id, Integer commId, String url) {
		super();
		this.id = id;
		this.commId = commId;
		this.url = url;
	}
	public Img() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCommId() {
		return commId;
	}
	public void setCommId(Integer commId) {
		this.commId = commId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
