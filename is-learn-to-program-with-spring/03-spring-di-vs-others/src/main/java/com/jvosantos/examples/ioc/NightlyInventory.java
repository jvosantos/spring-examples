package com.jvosantos.examples.ioc;

import java.util.List;

import com.jvosantos.examples.BookStore;
import com.jvosantos.examples.PurchaseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NightlyInventory {

	private static final String TITLE = "Clean Code";

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");
		
		PurchaseService purchaseService = context.getBean("purchaseService",
				PurchaseService.class);
	
		List<BookStore> bookStores = purchaseService.find(TITLE, "16802", 10);
		
		//Find inventory each night.

		((ClassPathXmlApplicationContext) context).close();
	}
}
