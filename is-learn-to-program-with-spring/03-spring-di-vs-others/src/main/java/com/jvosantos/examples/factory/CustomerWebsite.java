package com.jvosantos.examples.factory;

import com.jvosantos.examples.BookStore;
import com.jvosantos.examples.PurchaseService;

import java.util.List;

public class CustomerWebsite {

	public static void main(String[] args) {


		PurchaseService purchaseService = new PurchaseService(DigitalMediaLocatorFactory.createInstance());
		
		List<BookStore> bookStores = purchaseService.find("Clean Code", "16802", 10);
		
		//Allow website users to find titles
	}
}
