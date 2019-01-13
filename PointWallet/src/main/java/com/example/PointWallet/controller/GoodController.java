package com.example.PointWallet.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.PointWallet.pojo.Good;
import com.example.PointWallet.service.GoodService;
import com.example.PointWallet.service.OrderService;

/**
 *  商品控制器
 * */
@RequestMapping("/good")
@RestController
public class GoodController {

	@Autowired
	private GoodService goodService;
	
	@Autowired
	private OrderService orderService;

	/**
	  *  查詢商品
	 * 
	 * */
	// http://192.168.210.59:8089/pointwallet/good/find
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public List<Map<String, Object>>  findGoods() {
		System.out.println("--- find goodId=" );
		List goods = goodService.findGoods();
		return goods;
	}

	/**
	 *  购买商品
	 * */
	// http://192.168.210.59:8089/pointwallet/good/buy/123 
	@RequestMapping(value = "/buy/{userId}", method = RequestMethod.POST)
	public Map buyGood(@PathVariable("userId") String userId, Good good) {
		int flag = -1;
		Map result = new HashMap();
		try {
			flag = goodService.buyGood(good);
			orderService.createOrder(userId, good);
			
			result.put("flag", "1");
			result.put("message", "buy good sucessful");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("flag", "0");
			result.put("message", e.getMessage());
		}

		return result;
	}

	
	
	
	
	
	
	
	
}
