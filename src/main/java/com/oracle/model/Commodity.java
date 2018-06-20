package com.oracle.model;

public class Commodity {
	private Integer id;

    private String name;

    private String salePoint;

    private Integer cid;

    private Double price;

    private Integer store;

    private String mainImg;

    private String detail;

	public Commodity(Integer id, String name, String salePoint, Integer cid, Double price, Integer store,
			String mainImg, String detail) {
		super();
		this.id = id;
		this.name = name;
		this.salePoint = salePoint;
		this.cid = cid;
		this.price = price;
		this.store = store;
		this.mainImg = mainImg;
		this.detail = detail;
	}

	public Commodity() {
		super();
	}

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

	public String getSalePoint() {
		return salePoint;
	}

	public void setSalePoint(String salePoint) {
		this.salePoint = salePoint;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getStore() {
		return store;
	}

	public void setStore(Integer store) {
		this.store = store;
	}

	public String getMainImg() {
		return mainImg;
	}

	public void setMainImg(String mainImg) {
		this.mainImg = mainImg;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
    
    
}
