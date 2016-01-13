package com.jvosantos.examples.services;

import com.jvosantos.examples.services.events.MessagePrintedEvent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

@Service
public class MessagePrinter {

  private String name;
  private String separator;
  private MessageOfTheDayService service;

  @Inject
  private ApplicationEventPublisher publisher;

  public MessagePrinter() {
    System.out.println("no-arg Constructor called for " + MessagePrinter.class.getSimpleName());
  }

  public MessagePrinter(final String name, String separator, final MessageOfTheDayService service) {
    System.out.println("args Constructor called for " + MessagePrinter.class.getSimpleName());
    this.name = name;
    this.separator = separator;
    this.service = service;
  }

  @PostConstruct
  public void init() {
    System.out.println("init() called for " + MessagePrinter.class.getSimpleName());
  }

  @PreDestroy
  public void destroy() {
    System.out.println("destroy() called for " + MessagePrinter.class.getSimpleName());
  }

  public void printMessage() {
    final StringBuilder sb = new StringBuilder(name);
    sb.append(this.separator);
    sb.append(service.getMessage());

    System.out.println(sb);

    // raise an event
    publisher.publishEvent(new MessagePrintedEvent(this, sb.toString()));
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

  @Inject
  @Named(value = "timeStamped")
  public void setService(MessageOfTheDayService service) {
    this.service = service;
  }
}
