package com.example.PointWallet.pojo;

public class Good {
	private int id;
	// 虚拟商品名字
	private String product;
	// 价格
	private long price;
	// 分类
	private String category;
	// 子分类
	private String subCategory;
	// pwc个数
	private int pwcNum;
	// 商品詳情
	private String details;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public int getPwcNum() {
		return pwcNum;
	}
	public void setPwcNum(int pwcNum) {
		this.pwcNum = pwcNum;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}

	
	
	
}
