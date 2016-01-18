package com.jvosantos.examples;

import org.springframework.beans.factory.BeanNameAware;

public class BeanA implements BeanNameAware{
  private String beanName;
  private BeanB beanB;

  public BeanA() {
    System.out.println("BeanA()");
  }

  public BeanB getBeanB() {
    return beanB;
  }

  public void setBeanB(BeanB beanB) {
    System.out.println(beanName + ".setBeanB(BeanB " + beanB.getBeanName() + ")");
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
