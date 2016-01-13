package com.jvosantos.examples;


import com.jvosantos.examples.config.ApplicationConfiguration;
import com.jvosantos.examples.services.Printer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

  public static void main(final String[] args) {

    //configuration part
    try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)) {
      context.registerShutdownHook();
      Printer printer = context.getBean("mockPrinter", Printer.class);

      //doing something part...
      context.start();

      printer.printMessage();
      printer.printMessage();
      printer.printMessage();

//      ((Audit) printer).output();
      context.stop();
    } catch (final Exception ex) {
      ex.printStackTrace();
    }

  }
}
