package com.jvosantos.examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DataSourceConfig {
  @Bean(name = "dataSource")
  @Profile("development")
  public DataSource dataSourceDevelopment() {
    return new DataSource("localhost", 9999);
  }

  @Bean(name = "dataSource")
  @Profile("production")
  public DataSource dataSourceProduction() {
    return new DataSource("example.com", 8888);
  }
}
