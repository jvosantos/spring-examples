package com.jvosantos.examples.services.events;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextStopListener implements ApplicationListener<ContextStoppedEvent> {
  @Override
  public void onApplicationEvent(ContextStoppedEvent event) {
    System.out.println("********" + event);
  }
}
