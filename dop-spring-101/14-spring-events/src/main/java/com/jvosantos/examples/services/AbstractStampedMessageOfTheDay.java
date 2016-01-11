package com.jvosantos.examples.services;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

  @PostConstruct
  public abstract void init();

  @PreDestroy
  public abstract void destroy();
}
