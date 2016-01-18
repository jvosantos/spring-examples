package com.jvosantos.examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
// For this profile to be used, you need to set jvm parameter "-Dspring.profiles.active" to "PROD"
@Profile(value = "PROD")
public class ProductionApplicationConfiguration {

  @Bean
  public BeanA beanA() {
    BeanA beanA = new BeanA();
    beanA.setEnvironment("Production Environment");
    return beanA;
  }
}
