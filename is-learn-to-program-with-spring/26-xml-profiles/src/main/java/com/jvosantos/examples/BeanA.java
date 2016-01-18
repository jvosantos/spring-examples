package com.jvosantos.examples;

import org.springframework.beans.factory.BeanNameAware;

public class BeanA implements BeanNameAware{
  private String environment;
  private String beanName;

  public BeanA() {
    System.out.println("BeanA()");
  }

  public String getBeanName() {
    return beanName;
  }

  @Override
  public void setBeanName(String beanName) {
    this.beanName = beanName;
  }

  public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }
}
