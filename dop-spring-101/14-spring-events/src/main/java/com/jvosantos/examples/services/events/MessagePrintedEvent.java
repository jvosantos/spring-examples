package com.jvosantos.examples.services.events;

import org.springframework.context.ApplicationEvent;

public class MessagePrintedEvent extends ApplicationEvent {

  private String message;

  public MessagePrintedEvent(Object source) {
    super(source);
  }

  public MessagePrintedEvent(Object source, String message) {
    this(source);
    this.message = message;
  }

  @Override
  public String toString() {
    return "Message Printed Event raised with: (" + message + ")";
  }
}
