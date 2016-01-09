package com.jvosantos.examples.services;

public class ObjectFactory {

    public static MessagePrinterService getInstance(final Class<? extends MessagePrinterService> messagePrinterClass, final Class<? extends MessageOfTheDayService> messageOfTheDayClass) {
        final MessagePrinterService messagePrinterService = getInstance(messagePrinterClass);
        final MessageOfTheDayService messageOfTheDayService = getInstance(messageOfTheDayClass);
        messagePrinterService.setMessageService(messageOfTheDayService);
        return messagePrinterService;
    }

    public static <T> T getInstance(final Class<T> type) {
        T newInstance = null;
        if(type != null) {
            try {
                newInstance = type.newInstance();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        return newInstance;
    }


}
