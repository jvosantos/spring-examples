package com.jvosantos.examples;

import org.springframework.beans.factory.BeanNameAware;

public class BeanC implements BeanNameAware {
  private String beanName;

  public BeanC() {
    System.out.println("public BeanC()");
  }

  public String getBeanName() {
    return beanName;
  }

  @Override
  public void setBeanName(String beanName) {
    this.beanName = beanName;
  }
}
