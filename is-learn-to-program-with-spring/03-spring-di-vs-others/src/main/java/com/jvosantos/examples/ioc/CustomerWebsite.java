package com.jvosantos.examples.ioc;

import java.util.List;

import com.jvosantos.examples.BookStore;
import com.jvosantos.examples.PurchaseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerWebsite {
	private static final String TITLE = "Clean Code";

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");

		PurchaseService purchaseService = context.getBean("digitalMediaPurchaseService",
				PurchaseService.class);

		List<BookStore> bookStores = purchaseService.find(TITLE, "16802", 10);

		bookStores.stream().map(BookStore::getName).forEach(System.out::println);
		//Allow website users to find titles
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
