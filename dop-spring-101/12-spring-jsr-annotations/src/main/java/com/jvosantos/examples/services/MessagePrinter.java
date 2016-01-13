package com.jvosantos.examples.services;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

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

  @PostConstruct
  public void init() {
    System.out.println("init() called for " + MessagePrinter.class.getName());
  }

  @PreDestroy
  public void destroy() {
    System.out.println("destroy() called for " + MessagePrinter.class.getName());
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

  @Value("Printer Servicer")
  public void setName(String name) {
    this.name = name;
  }

  public String getSeparator() {
    return separator;
  }

  @Value(": ")
  public void setSeparator(String separator) {
    this.separator = separator;
  }

  public MessageOfTheDayService getService() {
    return service;
  }

  @Resource(name = "dynamicMessageOfTheDay")
  public void setService(MessageOfTheDayService service) {
    this.service = service;
  }
}
