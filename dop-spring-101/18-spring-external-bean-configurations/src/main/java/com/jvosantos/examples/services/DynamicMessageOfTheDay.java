package com.jvosantos.examples.services;

import com.jvosantos.examples.models.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

@Service("dynamicMessageOfTheDay")
public class DynamicMessageOfTheDay implements MessageOfTheDayService {
  // lists
  private List<Message> messagesValueList = new ArrayList<>();

  public DynamicMessageOfTheDay() {
    System.out.println("no-arg constructor called for " + DynamicMessageOfTheDay.class.getSimpleName());
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
