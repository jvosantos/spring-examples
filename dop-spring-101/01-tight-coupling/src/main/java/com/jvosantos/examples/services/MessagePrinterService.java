package com.jvosantos.examples.services;

public class MessagePrinterService {
    private final BasicMessageOfTheDay service = new BasicMessageOfTheDay();

    public MessagePrinterService() {}

    public void printMessage() {
        System.out.println(service.getTextMessage());
    }
}
