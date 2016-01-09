package com.jvosantos.examples;

import com.jvosantos.examples.services.MessagePrinterService;
import com.jvosantos.examples.services.MessageOfTheDayService;
import com.jvosantos.examples.services.BasicMessageOfTheDay;
import com.jvosantos.examples.services.DynamicMessageOfTheDay;
import com.jvosantos.examples.services.ObjectFactory;

public class Client {
    public static void main(String[] args) {
        final MessagePrinterService messagePrinter = ObjectFactory.getInstance(MessagePrinterService.class, DynamicMessageOfTheDay.class);

        messagePrinter.printMessage();
    }
}
