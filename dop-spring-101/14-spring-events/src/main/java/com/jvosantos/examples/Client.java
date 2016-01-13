package com.jvosantos.examples;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jvosantos.examples.services.MessagePrinter;

public class Client {

  public static void main(final String[] args) {


    //configuration part
    try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "/spring/application.xml")) {
      context.registerShutdownHook();
      MessagePrinter printer = context.getBean(MessagePrinter.class);

      //doing something part...
      context.start();

      printer.printMessage();

      context.stop();
    } catch (final Exception ex) {
      ex.printStackTrace();
    }


  }
}
