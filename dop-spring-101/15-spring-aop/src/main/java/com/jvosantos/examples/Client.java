package com.jvosantos.examples;


import com.jvosantos.examples.services.Printer;
import com.jvosantos.examples.services.audit.Audit;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jvosantos.examples.services.MessagePrinter;

public class Client {

  public static void main(final String[] args) {

    //configuration part
    try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "/spring/application.xml")) {
      context.registerShutdownHook();
      Printer printer = context.getBean(Printer.class);

      //doing something part...
      context.start();

      printer.printMessage();
      printer.printMessage();
      printer.printMessage();

      ((Audit) printer).output();
      context.stop();
    } catch (final Exception ex) {
      ex.printStackTrace();
    }

  }
}
