package com.jvosantos.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Application {

  private static final String TITLE = "The Clean Coder";

  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

    PurchaseService purchaseService = context.getBean("purchaseService", PurchaseService.class);

    List<BookStore> locations = purchaseService.find(TITLE, "16802", 10);

    System.out.printf("%s is available at the following locations:\n", TITLE);

    locations.stream().map(BookStore::getName).forEach(System.out::println);

    ((ClassPathXmlApplicationContext) context).close();
  }
}
