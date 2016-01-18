package com.jvosantos.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AnotherConfiguration.class)
@ComponentScan("com.jvosantos.examples")
public class ApplicationConfiguration {
  @Autowired
  private AnotherConfiguration anotherConfiguration;

  @Bean
  public BeanA beanA() {
    BeanA beanA = new BeanA();
    beanA.setBeanB(anotherConfiguration.beanB());
    return beanA;
  }
}
