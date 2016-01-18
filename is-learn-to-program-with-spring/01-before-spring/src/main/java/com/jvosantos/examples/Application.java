package com.jvosantos.examples;

import java.util.List;

public class Application {

  private static final String TITLE = "The Clean Coder";

  public static void main(String[] args) {

    PurchaseService purchaseService = new PurchaseService(new StoreLocator());
    List<BookStore> locations = purchaseService.find(TITLE, "16802", 10);

    System.out.printf("%s is available at the following locations:\n", TITLE);

    locations.stream().map(BookStore::getName).forEach(System.out::println);
  }
}
