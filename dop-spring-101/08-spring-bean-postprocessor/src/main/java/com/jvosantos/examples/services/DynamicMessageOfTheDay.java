package com.jvosantos.examples.services;

import com.jvosantos.examples.models.Message;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class DynamicMessageOfTheDay implements MessageOfTheDayService {

  private List<Message> messagesList = new ArrayList<>();

  public DynamicMessageOfTheDay() {
    System.out.println("no-arg Constructor called for " + DynamicMessageOfTheDay.class.getName());
  }

  public void init() {
    System.out.println("init() called for " + DynamicMessageOfTheDay.class.getName());
  }

  public void destroy() {
    System.out.println("destroy() called for " + DynamicMessageOfTheDay.class.getName());
  }


  public String getMessage() {

    // What day is it today??
    final int day = GregorianCalendar.getInstance().get(Calendar.DAY_OF_WEEK);

    // days start at on in Java
    String message = "";

    if (!messagesList.isEmpty()) {
      message = "From List:" + messagesList.get(day - 1).getMessage();
    }

    return message;
  }

  public void setMessagesList(final List<Message> messagesList) {
    // make a defensive copy of the list contents
    this.messagesList.addAll(messagesList);
  }

}
