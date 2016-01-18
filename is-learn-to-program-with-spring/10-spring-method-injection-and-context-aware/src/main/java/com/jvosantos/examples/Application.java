package com.jvosantos.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

    SingletonFaulty singletonFaulty = context.getBean("singletonFaulty", SingletonFaulty.class);

    Prototype proto1 = singletonFaulty.createPrototype();
    Prototype proto2 = singletonFaulty.createPrototype();

    System.out.println("proto1 == proto2 : " + (proto1 == proto2));

    SingletonContextAware singletonContextAware = context.getBean("singletonContextAware", SingletonContextAware.class);

    Prototype proto3 = singletonContextAware.createPrototype();
    Prototype proto4 = singletonContextAware.createPrototype();

    System.out.println("proto3 == proto4 : " + (proto4 == proto3));

    SingletonMethodInjection singletonMethodInjection = context.getBean("singletonMethodInjection", SingletonMethodInjection.class);

    Prototype proto5 = singletonMethodInjection.createPrototype();
    Prototype proto6 = singletonMethodInjection.createPrototype();

    System.out.println("proto5 == proto6 : " + (proto5 == proto6));


  }
}
