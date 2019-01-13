package com.example.PointWallet.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.PointWallet.pojo.Good;

@Service
public class GoodService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	public void sayHello() {
		System.out.println("jdbcTemplate=" + jdbcTemplate);
	}
	
	public List findGoods()
	{
		System.out.println("--- findGoods() jdbcTemplate=" + jdbcTemplate);

		String sql = "select * from good";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);

		return list;
	}

	public int buyGood(Good good) throws Exception {
		String sql = "insert into good (product, price, pwc ) values (?, ?, ?)";
		int flag = -1;
		try {
			flag = jdbcTemplate.update(sql, good.getProduct(), good.getPrice(), good.getPwcNum());	
		}catch(Exception e) {
			throw new Exception(e);
		}
		return flag;
	}

	
	
	
	
	
	
	
}
