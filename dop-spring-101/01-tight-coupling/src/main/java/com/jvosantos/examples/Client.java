package com.jvosantos.examples;

import com.jvosantos.examples.services.MessagePrinterService;

public class Client {
    public static void main(String[] args) {
        final MessagePrinterService messagePrinter = new MessagePrinterService();
        messagePrinter.printMessage();
    }
}
