package com.jvosantos.examples.services;

public class BasicMessageOfTheDay implements MessageOfTheDayService {

  private String message = "Hello World";

  public String getMessage() { return message; }

  public void setMessage(String message) { this.message = message; }
}
