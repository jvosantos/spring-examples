package com.jvosantos.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Application {
  public static void main(String[] args) {

    ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

    BeanA beanA = context.getBean("beanA", BeanA.class);

    beanA.execute();

  }
}
