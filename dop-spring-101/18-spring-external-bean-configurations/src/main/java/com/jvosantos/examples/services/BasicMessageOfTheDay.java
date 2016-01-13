package com.jvosantos.examples.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("basicMessageOfTheDay")
public class BasicMessageOfTheDay implements MessageOfTheDayService {

  private String message;

  public BasicMessageOfTheDay() {
    System.out.println("no-arg constructor called for " + BasicMessageOfTheDay.class.getSimpleName());
  }

  @Value("Hello World")
  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String getMessage() {
    return message;
  }
}
