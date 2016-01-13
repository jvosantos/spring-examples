package com.jvosantos.examples.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("basicMessageOfTheDay")
public class BasicMessageOfTheDay implements MessageOfTheDayService {

  private String message;

  @Value("Hello World")
  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String getMessage() {
    return message;
  }
}
