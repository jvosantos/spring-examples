package com.jvosantos.examples.services.events;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextStartListener implements ApplicationListener<ContextStartedEvent> {
  @Override
  public void onApplicationEvent(ContextStartedEvent event) {
    System.out.println("********" + event);
  }
}
