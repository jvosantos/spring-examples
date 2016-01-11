package com.jvosantos.examples.models;

public class Message {

  private String message = "No message";


  public Message(final String message) {
    this.message = message;
  }


  public String getMessage() {
    return message;
  }


  @Override public String toString() {
    return "Message [message=" + message + "]";
  }


}
