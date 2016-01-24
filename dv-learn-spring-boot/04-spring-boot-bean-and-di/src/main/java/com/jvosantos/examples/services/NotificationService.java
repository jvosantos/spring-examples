package com.jvosantos.examples.services;

import org.springframework.stereotype.Service;

@Service("userNotificationService")
public class NotificationService {
  public NotificationService() {
  }

  public void send() {
    // do something
  }

  public void sendAsync() {
    // do something
  }

  @Override
  public String toString() {
    return "NotificationService{}";
  }
}
