package com.jvosantos.examples.services;

import com.jvosantos.examples.models.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class DynamicMessageOfTheDay implements MessageOfTheDayService {
  // lists
  private List<Message> messagesValueList = new ArrayList<>();

  public DynamicMessageOfTheDay() {
  }

  @Inject
  public void setMessagesValueList(List<Message> messagesValueList) {
    this.messagesValueList = messagesValueList;
  }

  @Override
  public String getMessage() {
    // get current day
    final int day = GregorianCalendar.getInstance().get(Calendar.DAY_OF_WEEK);

    String message = "";

    if (!messagesValueList.isEmpty()) {
      message = "From list: " + messagesValueList.get(day - 1);
    }

    return message;
  }
}
