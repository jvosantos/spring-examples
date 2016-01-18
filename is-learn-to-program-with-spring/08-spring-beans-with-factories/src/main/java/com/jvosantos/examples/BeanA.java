package com.jvosantos.examples;

import java.util.Calendar;

public class BeanA {
  private Calendar calendar;

  public BeanA(Calendar calendar) {
    System.out.println("BeanA(Calendar " + calendar);
    this.calendar = calendar;
  }

  public int getYear() {
    return calendar.get(Calendar.YEAR);
  }

}
