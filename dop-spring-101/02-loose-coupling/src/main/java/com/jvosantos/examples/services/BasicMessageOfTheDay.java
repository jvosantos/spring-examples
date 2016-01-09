package com.jvosantos.examples.services;

public class BasicMessageOfTheDay implements MessageOfTheDayService {

    @Override
    public String getMessage() {
        return "Hello World";
    }
}
