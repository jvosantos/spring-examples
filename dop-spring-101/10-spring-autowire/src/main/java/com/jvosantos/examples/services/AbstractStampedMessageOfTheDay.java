package com.jvosantos.examples.services;

public abstract class AbstractStampedMessageOfTheDay implements MessageOfTheDayService {
  private String message = "Hello World";

  public AbstractStampedMessageOfTheDay() {
    System.out.println("no-arg constructor called for " + AbstractStampedMessageOfTheDay.class.getName());
  }

  @Override
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
