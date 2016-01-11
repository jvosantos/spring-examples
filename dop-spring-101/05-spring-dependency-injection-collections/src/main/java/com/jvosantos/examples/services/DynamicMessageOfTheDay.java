package com.jvosantos.examples.services;

import com.jvosantos.examples.models.MessageValue;
import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

import java.util.*;

public class DynamicMessageOfTheDay implements MessageOfTheDayService {
  // arrays
  private String[] messagesArray = {};
  private MessageValue[] messagesValueArray = {};

  // lists
  private List<String> messagesList = new ArrayList<>();
  private List<MessageValue> messagesValueList = new ArrayList<>();

  // Maps
  private Map<Integer, String> messagesMap = new HashMap<>();
  private Map<Integer, MessageValue> messagesValueMap = new HashMap<>();

  public DynamicMessageOfTheDay() {
  }

  public String[] getMessagesArray() {
    return messagesArray;
  }

  public void setMessagesArray(String[] messagesArray) {
    this.messagesArray = messagesArray;
  }

  public MessageValue[] getMessagesValueArray() {
    return messagesValueArray;
  }

  public void setMessagesValueArray(MessageValue[] messagesValueArray) {
    this.messagesValueArray = messagesValueArray;
  }

  public List<String> getMessagesList() {
    return messagesList;
  }

  public void setMessagesList(List<String> messagesList) {
    this.messagesList = messagesList;
  }

  public List<MessageValue> getMessagesValueList() {
    return messagesValueList;
  }

  public void setMessagesValueList(List<MessageValue> messagesValueList) {
    this.messagesValueList = messagesValueList;
  }

  public Map<Integer, String> getMessagesMap() {
    return messagesMap;
  }

  public void setMessagesMap(Map<Integer, String> messagesMap) {
    this.messagesMap.putAll(messagesMap);
  }

  public Map<Integer, MessageValue> getMessagesValueMap() {
    return messagesValueMap;
  }

  public void setMessagesValueMap(Map<Integer, MessageValue> messagesValueMap) {
    this.messagesValueMap.putAll(messagesValueMap);
  }

  @Override public String getMessage() {
    // get current day
    final int day = GregorianCalendar.getInstance().get(Calendar.DAY_OF_WEEK);

    String message = "";

    // Array examples
    if (messagesArray.length > 0) {
      message = "From array: " + messagesArray[day - 1];
    }
    if (messagesValueArray.length > 0) {
      message = "From array: " + messagesValueArray[day - 1];
    }

    // List examples
    if (!messagesList.isEmpty()) {
      message = "From list: " + messagesList.get(day - 1);
    }
    if (!messagesValueList.isEmpty()) {
      message = "From list: " + messagesValueList.get(day - 1);
    }

    // Map examples
    if (!messagesMap.isEmpty()) {
      message = "From map: " + messagesMap.get(day - 1);
    }
    if (!messagesValueMap.isEmpty()) {
      message = "From map: " + messagesValueMap.get(day - 1);
    }

    return message;
  }
}

