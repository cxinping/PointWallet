package com.example.PointWallet.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.PointWallet.pojo.Good;
import com.example.PointWallet.util.UUIDHelper;

@Service
public class OrderService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List findOrders()
	{
		String sql = "select * from orders";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		return list;
	}
	
	public int createOrder(String userId, Good good) throws Exception {
		String sql = "insert into orders (orderNo, buyTime, goodName, userId,detail ) values (?, ?, ?, ?, ?)";
		Date buyTime = new Date();
		String orderNo = UUIDHelper.generateUUID();
		String detail = "订单编号: " + orderNo + ",下单时间:" + buyTime+",购买商品:" + good.getProduct()+ ",购买价格:" + good.getPrice();
		int flag = -1;
		try {
			flag = jdbcTemplate.update(sql, orderNo, buyTime, good.getProduct(), userId,  detail);	
		}catch(Exception e) {
			throw new Exception(e);
		}
		
		return flag;		
	}
	
	
}
