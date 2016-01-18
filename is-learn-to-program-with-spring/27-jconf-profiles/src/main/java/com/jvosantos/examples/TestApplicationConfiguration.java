package com.jvosantos.examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
// For this profile to be used, you need to set jvm parameter "-Dspring.profiles.active" to "TEST"
@Profile(value = "TEST")
public class TestApplicationConfiguration {

  @Bean
  public BeanA beanA() {
    BeanA beanA = new BeanA();
    beanA.setEnvironment("Test Environment");
    return beanA;
  }
}
