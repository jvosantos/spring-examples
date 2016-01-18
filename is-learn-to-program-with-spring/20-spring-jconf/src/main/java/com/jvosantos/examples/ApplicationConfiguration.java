package com.jvosantos.examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

  /**
   * The method name defines the bean id.
   * The return type defines the bean type.
   */
  @Bean
  public BeanA beanA() {
    return new BeanA();
  }

}
