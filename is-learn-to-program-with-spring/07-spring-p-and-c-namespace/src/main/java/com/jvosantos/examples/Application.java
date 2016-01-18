package com.jvosantos.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String[] args) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");

    BeanA beanA = applicationContext.getBean("beanA", BeanA.class);
    beanA.getBeanB().execute();
  }
}
