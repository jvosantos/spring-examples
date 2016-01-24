package com.jvosantos.examples.exceptions;

public class PostNotFoundException extends RuntimeException {
  public PostNotFoundException(String message) {
    super(message);
  }
}
