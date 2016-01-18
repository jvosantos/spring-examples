package com.jvosantos.examples.manual;

import com.jvosantos.examples.KioskLocator;
import com.jvosantos.examples.PurchaseService;

public class CustomerWebsite {

	public static void main(String[] args) {

		PurchaseService purchaseService = new PurchaseService(new KioskLocator(""));
		
		purchaseService.find("Clean Code", "16802", 10);

		//Allow website users to find titles
	}
}
