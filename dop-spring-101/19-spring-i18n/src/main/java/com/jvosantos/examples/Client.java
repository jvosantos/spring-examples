package com.jvosantos.examples;


import com.jvosantos.examples.services.Printer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

  public static void main(final String[] args) {

    //configuration part
    try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/application.xml")) {
      context.registerShutdownHook();
      Printer printer = context.getBean("messagePrinter", Printer.class);

      //doing something part...
      context.start();

      printer.printMessage();
      printer.printMessage();
      printer.printMessage();

      context.stop();
    } catch (final Exception ex) {
      ex.printStackTrace();
    }

  }
}
