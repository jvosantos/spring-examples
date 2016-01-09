package com.jvosantos.examples;

import com.jvosantos.examples.services.MessagePrinterService;
import com.jvosantos.examples.services.MessageOfTheDayService;
import com.jvosantos.examples.services.BasicMessageOfTheDay;
import com.jvosantos.examples.services.DynamicMessageOfTheDay;

public class Client {
    public static void main(String[] args) {
        // final MessageOfTheDayService messageService = new BasicMessageOfTheDay();
        final MessageOfTheDayService messageService = new DynamicMessageOfTheDay();

        final MessagePrinterService messagePrinter = new MessagePrinterService();
        messagePrinter.setMessageService(messageService);
        messagePrinter.printMessage();
    }
}
