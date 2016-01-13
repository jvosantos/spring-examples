package com.jvosantos.examples.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

@Service
@Named(value = "messagePrinter")
public class MessagePrinter implements Printer {

  private String name;
  private String separator;
  private MessageOfTheDayService service;

  public MessagePrinter() {
    System.out.println("no-arg Constructor called for " + MessagePrinter.class.getSimpleName());
  }

  public MessagePrinter(final String name, String separator, final MessageOfTheDayService service) {
    System.out.println("args Constructor called for " + MessagePrinter.class.getSimpleName());
    this.name = name;
    this.separator = separator;
    this.service = service;
  }

  @Override
  public void printMessage() {
    printMessage(service.getMessage());
  }

  @Override
  public void printMessage(String message) {
    final StringBuilder sb = new StringBuilder(name);
    sb.append(this.separator);
    sb.append(message);

    System.out.println(sb);
  }

  public String getName() {
    return name;
  }

  @Value("${messagePrinter.name}")
  public void setName(String name) {
    this.name = name;
  }

  public String getSeparator() {
    return separator;
  }

  @Value("${messagePrinter.separator}")
  public void setSeparator(String separator) {
    this.separator = separator;
  }

  public MessageOfTheDayService getService() {
    return service;
  }

  @Inject
  @Named(value = "basicMessageOfTheDay")
  public void setService(MessageOfTheDayService service) {
    this.service = service;
  }
}
