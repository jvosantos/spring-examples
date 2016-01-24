package com.jvosantos.examples.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

//@SpringBootApplication - // Same as @Configuration @EnableAutoConfiguration @ComponentScan
//@Configuration - // This class is a source of bean definitions for the application context
//@EnableAutoConfiguration - //
//@ComponentScan - // Scan for components, configurations and services starting from THIS package

@SpringBootApplication
//Overriding component scan to scan for other packages
@ComponentScan({"com.jvosantos.examples.application", "com.jvosantos.examples.services"})
public class SpringBeansApplication {

  @Bean
  public User user() {
    return new User("John", "Smith");
  }

  public static void main(String[] args) {

    ApplicationContext context = SpringApplication.run(SpringBeansApplication.class, args);

    String[] beanNames = context.getBeanDefinitionNames();

    Arrays.stream(beanNames).sorted().forEach(System.out::println);

    System.out.println(context.getBean("user"));
  }
}
