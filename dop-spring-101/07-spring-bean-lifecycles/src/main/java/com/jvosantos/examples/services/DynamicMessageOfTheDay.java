package com.jvosantos.examples.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import com.jvosantos.examples.models.Message;

public class DynamicMessageOfTheDay implements MessageOfTheDayService {

  private List<Message> messagesValueList = new ArrayList<Message>();

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

    if (!messagesValueList.isEmpty()) {
      message = "From Array:" + messagesValueList.get(day - 1);
    }

    return message;
  }

  public void setMessagesValueList(final List<Message> messagesValueList) {
    // make a defensive copy of the list contents
    this.messagesValueList.addAll(messagesValueList);
  }

}
