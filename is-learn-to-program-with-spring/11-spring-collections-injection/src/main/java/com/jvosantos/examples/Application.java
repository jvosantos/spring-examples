package com.jvosantos.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

    BeanA beanA1 = context.getBean("beanA1", BeanA.class);

    System.out.println("List:");
    beanA1.getList().stream().forEach(System.out::println);

    System.out.println("Set:");
    beanA1.getSet().stream().forEach(System.out::println);

    System.out.println("Map:");
    beanA1.getMap().values().stream().forEach(System.out::println);

    System.out.println("Properties:");
    beanA1.getProperties().keySet().stream().forEach(System.out::println);

    BeanA beanA2 = context.getBean("beanA2", BeanA.class);

    System.out.println("List:");
    beanA2.getList().stream().forEach(System.out::println);

    System.out.println("Set:");
    beanA2.getSet().stream().forEach(System.out::println);

    System.out.println("Map:");
    beanA2.getMap().values().stream().forEach(System.out::println);

    System.out.println("Properties:");
    beanA2.getProperties().keySet().stream().forEach(System.out::println);
  }
}
