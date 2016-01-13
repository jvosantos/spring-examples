package com.jvosantos.examples.models;

public class MessageValue {

  private String message = "";

  public MessageValue(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override public String toString() {
    return "MessageValue{" +
        "message='" + message + '\'' +
        '}';
  }
}
