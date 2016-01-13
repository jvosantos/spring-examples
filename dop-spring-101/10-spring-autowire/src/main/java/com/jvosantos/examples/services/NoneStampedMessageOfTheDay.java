package com.jvosantos.examples.services;

public class NoneStampedMessageOfTheDay extends AbstractStampedMessageOfTheDay {
  public NoneStampedMessageOfTheDay() {
    super();
    System.out.println("no-arg constructor called for " + NoneStampedMessageOfTheDay.class.getName());
  }
}
