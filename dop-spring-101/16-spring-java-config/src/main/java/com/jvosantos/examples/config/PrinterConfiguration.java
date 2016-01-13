package com.jvosantos.examples.config;

import com.jvosantos.examples.services.MockMessagePrinter;
import com.jvosantos.examples.services.Printer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfiguration {
  @Bean
  public Printer mockPrinter() {
    return new MockMessagePrinter();
  }
}
