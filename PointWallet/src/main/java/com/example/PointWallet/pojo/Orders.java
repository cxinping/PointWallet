package com.example.PointWallet.pojo;

import java.util.Date;

public class Orders {
	
	private int id;
	// 订单号
	private String orderNo;
	// 购买日期
	private Date buyTime;
	// 用户id
	private String userId;
	// 商品詳情
	private String details;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Date getBuyTime() {
		return buyTime;
	}
	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", orderNo=" + orderNo + ", buyTime=" + buyTime + ", userId=" + userId
				+ ", details=" + details + "]";
	}
	
	
	
	
	
}
