package com.jvosantos.examples.services;

public class MessagePrinterService {
    private MessageOfTheDayService service;

    public MessagePrinterService() {}

    public void printMessage() {
        System.out.println(service.getMessage());
    }

    public void setMessageService(final MessageOfTheDayService service) {
        this.service = service;
    }
}
