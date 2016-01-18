package com.jvosantos.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

    BeanA beanA = context.getBean("beanA", BeanA.class);

    System.out.println(beanA.getBeanB().getBeanD().getProperty());
    System.out.println(beanA.getBeanC().getBeanD().getProperty());
  }
}
