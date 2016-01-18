package com.jvosantos.examples;

import org.springframework.beans.factory.BeanNameAware;

public class BeanA implements BeanNameAware {
  private String beanName;

  private BeanB beanB;

  public BeanA(BeanB beanB) {
    System.out.println("BeanA(BeanB " + beanB.getBeanName() + ")");
    this.beanB = beanB;
  }

  public String getBeanName() {
    return beanName;
  }

  @Override
  public void setBeanName(String beanName) {
    this.beanName = beanName;
  }
}
