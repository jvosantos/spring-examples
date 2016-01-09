package com.jvosantos.examples;



import com.jvosantos.examples.services.MessagePrinter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
  public static void main(String[] args) {
    try (final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/application.xml")) {

      // using id of bean and casting
      // final MessagePrinter printer = (MessagePrinter) context.getBean("printer");

      // using id of bean and type of id to avoid casting
      // final MessagePrinter printer = context.getBean("printer", MessagePrinter.class);

      // using only type of bean
      // similar to autowiring
      final MessagePrinter printer = context.getBean(MessagePrinter.class);

      printer.printMessage();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
