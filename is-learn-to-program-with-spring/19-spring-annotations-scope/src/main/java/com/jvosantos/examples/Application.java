package com.jvosantos.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Application {
  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

    BeanA beanA1 = context.getBean("beanA", BeanA.class);
    BeanA beanA2 = context.getBean("beanA", BeanA.class);

    BeanB beanB1 = context.getBean("beanB", BeanB.class);
    BeanB beanB2 = context.getBean("beanB", BeanB.class);

    System.out.println("beanA1 == beanA2 : " + (beanA1 == beanA2));
    System.out.println("beanB1 == beanB2 : " + (beanB1 == beanB2));

  }
}
