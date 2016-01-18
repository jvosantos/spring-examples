package com.jvosantos.examples;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanC implements BeanNameAware {
  private String beanName;
  private String message;

  public BeanC() {
    System.out.println("BeanC()");
  }

  public void execute() {
    System.out.println(beanName + ":execute()");
  }

  public String getMessage() {
    return message;
  }

  @Value("Hello World")
  public void setMessage(String message) {
    System.out.println(beanName + ".setMessage(String " + message + ")");
    this.message = message;
  }

  public String getBeanName() {
    return beanName;
  }

  @Override
  public void setBeanName(String beanName) {
    this.beanName = beanName;
  }
}
