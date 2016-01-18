package com.jvosantos.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Application {
  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

    BeanA beanA = context.getBean("beanA", BeanA.class);

    System.out.println("PropertyA: " + beanA.getPropertyA());
    System.out.println("PropertyB: " + beanA.getPropertyB());
    System.out.println("PropertyC: " + beanA.getPropertyC());
  }
}
