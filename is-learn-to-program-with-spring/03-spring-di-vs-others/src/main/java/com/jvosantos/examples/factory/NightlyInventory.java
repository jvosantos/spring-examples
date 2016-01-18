package com.jvosantos.examples.factory;

import java.util.List;

import com.jvosantos.examples.BookStore;
import com.jvosantos.examples.PurchaseService;

public class NightlyInventory {

	private static final String TITLE = "Forest Gump";

	public static void main(String[] args) {
		
		PurchaseService purchaseService = new PurchaseService(KioskLocatorFactory.createInstance());
		
		List<BookStore> bookStores = purchaseService.find(TITLE, "16802", 10);

		//Find inventory each night.
	}
}
