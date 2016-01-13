package com.jvosantos.examples.services;

import org.springframework.beans.factory.annotation.Value;

public class BasicMessageOfTheDay implements MessageOfTheDayService {

  @Value("Hello World")
  private String message;

  public String getMessage() { return message; }

  public void setMessage(String message) { this.message = message; }
}
