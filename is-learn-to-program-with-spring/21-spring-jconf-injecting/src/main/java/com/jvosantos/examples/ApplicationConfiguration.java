package com.jvosantos.examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

  @Bean
  public BeanA beanA() {
    System.out.println(ApplicationConfiguration.class.getSimpleName() + ".beanA() : beanB() == beanB() = " + (beanB() == beanB()));
    return new BeanA(beanB());
  }

  @Bean
  public BeanB beanB() {
    BeanB beanB = new BeanB();
    beanB.setBeanC(beanC());
    return beanB;
  }

  @Bean
  public BeanC beanC() {
    return new BeanC("Hello World!");
  }



}
