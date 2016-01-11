package com.jvosantos.examples.services;

import java.util.Date;
import java.util.GregorianCalendar;

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
}
