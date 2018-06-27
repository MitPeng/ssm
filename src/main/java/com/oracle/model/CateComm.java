package com.oracle.model;

import java.util.List;
import com.oracle.model.Commodity;

public class CateComm {
	private Integer catId;
	private String catName;
	private List<Commodity> comms;
	
	public CateComm() {
		super();
	}
	public CateComm(Integer catId, String catName, List<Commodity> comms) {
		super();
		this.catId = catId;
		this.catName = catName;
		this.comms = comms;
	}
	public Integer getCatId() {
		return catId;
	}
	public void setCatId(Integer catId) {
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public List<Commodity> getComms() {
		return comms;
	}
	public void setComms(List<Commodity> comms) {
		this.comms = comms;
	}
}
