package com.jvosantos.examples.services;

public class MessagePrinter {
  private String name;
  private String separator;
  private MessageOfTheDayService service;

  public MessagePrinter() {
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSeparator(String separator) {
    this.separator = separator;
  }

  public void setService(MessageOfTheDayService service) {
    this.service = service;
  }

  public void printMessage() {
    final StringBuilder sb = new StringBuilder(name);
    sb.append(separator);
    sb.append(service.getMessage());

    System.out.println(sb.toString());
  }
}
