package com.example.PointWallet.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.PointWallet.service.OrderService;

/**
 * 订单控制器
 * 
 */
@RequestMapping("/orders")
@RestController
public class OrdersController {
	@Autowired
	private OrderService orderService;

	// 192.168.210.59:8089/pointwallet/orders/find
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public List<Map<String, Object>> findOrders() {
		System.out.println("--- findOrders orderId=" );
		List orders = orderService.findOrders();

		System.out.println("+++ orders=" + orders + ", size=" + orders.size());
		return orders;
	}

}
