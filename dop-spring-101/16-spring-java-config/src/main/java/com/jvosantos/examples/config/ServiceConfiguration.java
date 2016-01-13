package com.jvosantos.examples.config;

import com.jvosantos.examples.services.BasicMessageOfTheDay;
import com.jvosantos.examples.services.MessageOfTheDayService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

  @Bean
  public MessageOfTheDayService messageOfTheDay() {
    return new BasicMessageOfTheDay();
  }
}
