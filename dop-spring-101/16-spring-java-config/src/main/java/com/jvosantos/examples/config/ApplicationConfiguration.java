package com.jvosantos.examples.config;

import com.jvosantos.examples.services.MessageConfiguration;
import org.springframework.context.annotation.*;

import javax.inject.Inject;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.jvosantos.examples")
public class ApplicationConfiguration {

  @Inject
  private PrinterConfiguration printerConfiguration;

  @Inject
  private MessageConfiguration messageConfiguration;
}
