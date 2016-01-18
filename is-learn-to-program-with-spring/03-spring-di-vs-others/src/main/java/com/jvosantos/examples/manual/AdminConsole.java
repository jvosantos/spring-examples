package com.jvosantos.examples.manual;

import com.jvosantos.examples.BookStore;
import com.jvosantos.examples.KioskLocator;
import com.jvosantos.examples.PurchaseService;

import java.util.List;

public class AdminConsole {


	public static void main(String[] args) {
		PurchaseService purchaseService = new PurchaseService(new KioskLocator(""));

		List<BookStore> bookStores = purchaseService.find("Clean Code", "16802", 10);
		
		//Allow admins to support customers
		
	}
}
