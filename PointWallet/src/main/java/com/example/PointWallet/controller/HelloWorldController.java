package com.example.PointWallet.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	// http://127.0.0.1:8080/pointwallet
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/hello")
	public String index() {
		return "Hello World ";
	}

	@RequestMapping("/hello/{myName}")
	String index(@PathVariable String myName) {
		return "Hello " + myName;
	}

}
