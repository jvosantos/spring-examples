package com.jvosantos.examples;

import org.springframework.beans.factory.BeanNameAware;

public class BeanC implements BeanNameAware {
  private String beanName;
  private String message;

  public BeanC(String message) {
    System.out.println("BeanC(String " + message + ")");
    this.message = message;
  }

  public void execute() {
    System.out.println(beanName + ":execute()");
  }

  public String getBeanName() {
    return beanName;
  }

  @Override
  public void setBeanName(String beanName) {
    this.beanName = beanName;
  }
}
