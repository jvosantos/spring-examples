package com.jvosantos.examples.services;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// implement InitializingBean and or DisposableBean to get methods that will be called for
// initialization and destruction
public class MessagePrinter implements InitializingBean, DisposableBean{

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

  @Override
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

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("After property set called in MessagePrinter");
  }
}
