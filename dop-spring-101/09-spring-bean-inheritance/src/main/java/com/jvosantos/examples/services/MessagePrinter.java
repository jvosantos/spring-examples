package com.jvosantos.examples.services;

public class MessagePrinter {

  private String name;
  private String separator;
  private MessageOfTheDayService service;

  public MessagePrinter() {
    System.out.println("no-arg Constructor called for " + MessagePrinter.class.getName());
  }

  public MessagePrinter(final String name, String separator, final MessageOfTheDayService service) {
    System.out.println("args Constructor called for " + MessagePrinter.class.getName());
    this.name = name;
    this.separator = separator;
    this.service = service;
  }

  public void init() {
    System.out.println("init called in MessagePrinter");
  }

  public void destroy() {
    System.out.println("destroy called in MessagePrinter");
  }

  public void printMessage() {
    final StringBuilder sb = new StringBuilder(name);
    sb.append(this.separator);
    sb.append(service.getMessage());

    System.out.println(sb);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSeparator() {
    return separator;
  }

  public void setSeparator(String separator) {
    this.separator = separator;
  }

  public MessageOfTheDayService getService() {
    return service;
  }

  public void setService(MessageOfTheDayService service) {
    this.service = service;
  }
}
