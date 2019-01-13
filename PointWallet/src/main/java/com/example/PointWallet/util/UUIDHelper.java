package com.example.PointWallet.util;

import java.util.UUID;

public class UUIDHelper {

	public static String generateUUID() {
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		return uuid;
	}
	
	
	
}
