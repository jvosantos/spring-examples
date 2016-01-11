package com.jvosantos.examples.services;

public class MessagePrinter {
  private String name;
  private String separator;
  private MessageOfTheDayService service;

  public MessagePrinter(String name, String separator, MessageOfTheDayService service) {
    this.name = name;
    this.separator = separator;
    this.service = service;
  }

  public void printMessage() {
    final StringBuilder sb = new StringBuilder(name);
    sb.append(separator);
    sb.append(service.getMessage());

    System.out.println(sb.toString());
  }
}
