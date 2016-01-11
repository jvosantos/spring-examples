package com.jvosantos.examples;



import com.jvosantos.examples.services.MessagePrinter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
  public static void main(String[] args) {
    try (final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/application.xml")) {

      final MessagePrinter printer = context.getBean(MessagePrinter.class);

      printer.printMessage();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
