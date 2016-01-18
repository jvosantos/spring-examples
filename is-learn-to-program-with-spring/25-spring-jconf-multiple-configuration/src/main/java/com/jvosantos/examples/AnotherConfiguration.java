package com.jvosantos.examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnotherConfiguration {

  @Bean
  public BeanB beanB() {
    return new BeanB();
  }
}
