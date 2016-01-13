package com.jvosantos.examples.services;

import javax.inject.Inject;
import javax.inject.Named;

public class MockMessagePrinter implements Printer {
  @Inject
  @Named("dynamicMessageOfTheDay")
  private MessageOfTheDayService service;

  public MockMessagePrinter() {
  }

  public MockMessagePrinter(MessageOfTheDayService service) {
    this.service = service;
  }

  @Override
  public void printMessage() {
    if(service == null) {
      printMessage("No message available");
    } else {
      printMessage(service.getMessage());
    }
  }

  @Override
  public void printMessage(String message) {
    System.out.println("mock " + message);
  }
}
