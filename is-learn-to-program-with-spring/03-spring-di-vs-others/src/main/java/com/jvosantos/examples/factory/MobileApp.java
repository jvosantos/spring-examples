package com.jvosantos.examples.factory;

import com.jvosantos.examples.BookStore;
import com.jvosantos.examples.PurchaseService;

import java.util.List;

public class MobileApp {

	private static final String TITLE = "Clean Code";

	public static void main(String[] args) {
		
		PurchaseService purchaseService = new PurchaseService(KioskLocatorFactory.createInstance());
		
		List<BookStore> bookStores = purchaseService.find(TITLE, "16802", 10);
		
		//Allow mobile users to find titles
	}
}
