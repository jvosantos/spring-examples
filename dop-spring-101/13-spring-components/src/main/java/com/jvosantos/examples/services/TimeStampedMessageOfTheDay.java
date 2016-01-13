package com.jvosantos.examples.services;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.GregorianCalendar;

@Service("timeStamped")
public class TimeStampedMessageOfTheDay extends AbstractStampedMessageOfTheDay {
  public TimeStampedMessageOfTheDay() {
    super();
    System.out.println("no-arg constructor called for " + TimeStampedMessageOfTheDay.class.getName());
  }

  @Override
  public String getMessage() {
    final Date now = GregorianCalendar.getInstance().getTime();
    return now.toString() + ": " + super.getMessage();
  }

  @Override
  public void init() {
    System.out.println("init() called for " + TimeStampedMessageOfTheDay.class.getName());
  }

  @Override
  public void destroy() {
    System.out.println("destroy() called for " + TimeStampedMessageOfTheDay.class.getName());
  }
}
