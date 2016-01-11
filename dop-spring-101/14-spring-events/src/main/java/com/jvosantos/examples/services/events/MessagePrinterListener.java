package com.jvosantos.examples.services.events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinterListener implements ApplicationListener<MessagePrintedEvent> {

  @Override
  public void onApplicationEvent(MessagePrintedEvent messagePrintedEvent) {
    System.out.println(
        MessagePrinterListener.class.getSimpleName() + " received " + messagePrintedEvent.getClass()
            .getSimpleName() + " - start");
    try {
      Thread.sleep(3000);
      System.out.println(" >>>> " + messagePrintedEvent);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(
        MessagePrinterListener.class.getSimpleName() + " received " + messagePrintedEvent.getClass()
            .getSimpleName() + " - completed");
  }
}
