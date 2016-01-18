package com.jvosantos.examples;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class BeanC implements BeanNameAware {

  private String beanName;

  public BeanC() {
    System.out.println("BeanC()");
  }

  public String getBeanName() {
    return beanName;
  }

  @Override
  public void setBeanName(String beanName) {
    this.beanName = beanName;
  }

  @Override
  public String toString() {
    return beanName;
  }
}
