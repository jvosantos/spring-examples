package com.jvosantos.examples.manual;

import com.jvosantos.examples.KioskLocator;
import com.jvosantos.examples.PurchaseService;

public class MobileApp {

	
	public static void main(String[] args) {
		
		PurchaseService purchaseService = new PurchaseService(new KioskLocator(""));
		purchaseService.find("Speed", "55555", 4);
		
		//Allow mobile users to find titles
	}
}
