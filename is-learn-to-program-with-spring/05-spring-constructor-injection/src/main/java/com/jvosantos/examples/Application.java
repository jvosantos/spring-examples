package com.jvosantos.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String[] args) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");

    BeanA beanA1 = applicationContext.getBean("beanA1", BeanA.class);
    BeanA beanA2 = applicationContext.getBean("beanA2", BeanA.class);
    BeanA beanA3 = applicationContext.getBean("beanA3", BeanA.class);
    BeanA beanA4 = applicationContext.getBean("beanA4", BeanA.class);
  }
}
