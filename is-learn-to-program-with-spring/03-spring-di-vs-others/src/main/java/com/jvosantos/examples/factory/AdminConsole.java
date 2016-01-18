package com.jvosantos.examples.factory;

import java.util.List;

import com.jvosantos.examples.BookStore;
import com.jvosantos.examples.PurchaseService;

public class AdminConsole {

	public static void main(String[] args) {

		PurchaseService purchaseService = new PurchaseService(KioskLocatorFactory.createInstance());

		List<BookStore> bookStores = purchaseService.find("Clean Code", "16802", 10);

		//Allow admins to support customers
	}
}
