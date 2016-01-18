package com.jvosantos.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String[] args) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");

    BeanA bean1 = applicationContext.getBean("bean1", BeanA.class);
    BeanA bean2 = applicationContext.getBean("bean2", BeanA.class);
    BeanA bean3 = applicationContext.getBean("_beanA", BeanA.class);

    System.out.println("bean1 == bean2 : " + (bean1 == bean2));
    System.out.println("bean1 == bean3 : " + (bean1 == bean3));
  }
}
