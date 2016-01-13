package com.jvosantos.examples.services;

public class BasicMessageOfTheDay implements MessageOfTheDayService {


  private String message;

  public BasicMessageOfTheDay() {
    System.out.println("no-arg Constructor called for " + BasicMessageOfTheDay.class.getName());
  }

  public void init() {
    System.out.println("init() called for " + BasicMessageOfTheDay.class.getName());
  }

  public void destroy() {
    System.out.println("destroy() called for " + BasicMessageOfTheDay.class.getName());
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


}
