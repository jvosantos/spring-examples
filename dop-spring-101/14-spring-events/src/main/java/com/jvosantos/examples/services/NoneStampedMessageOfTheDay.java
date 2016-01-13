package com.jvosantos.examples.services;

import org.springframework.stereotype.Service;

@Service("NoneStamped")
public class NoneStampedMessageOfTheDay extends AbstractStampedMessageOfTheDay {
  public NoneStampedMessageOfTheDay() {
    super();
    System.out.println("no-arg constructor called for " + NoneStampedMessageOfTheDay.class.getName());
  }

  @Override
  public void init() {
    System.out.println("init() called for " + NoneStampedMessageOfTheDay.class.getName());
  }

  @Override
  public void destroy() {
    System.out.println("destroy() called for " + NoneStampedMessageOfTheDay.class.getName());
  }
}
