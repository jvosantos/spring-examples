package com.jvosantos.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Application {
  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

    BeanA beanA = context.getBean("beanA", BeanA.class);

    Arrays.stream(beanA.getBeanBArray()).map(BeanB::getBeanName).forEach(System.out::println);
    beanA.getBeanBList().stream().map(BeanB::getBeanName).forEach(System.out::println);
    beanA.getBeanBMap().values().stream().map(BeanB::getBeanName).forEach(System.out::println);
  }
}
