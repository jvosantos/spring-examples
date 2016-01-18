package com.jvosantos.examples;

import org.springframework.beans.factory.BeanNameAware;

public class BeanB implements BeanNameAware {

  private String beanName;

  public BeanB() {
    System.out.println("BeanB()");
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
