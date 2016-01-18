package com.jvosantos.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String[] args) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");

    BeanA beanA1 = applicationContext.getBean("beanA1", BeanA.class);
    beanA1.getBeanB().execute();

    BeanA beanA2 = applicationContext.getBean("beanA2", BeanA.class);
    beanA2.getBeanB().execute();
  }
}
