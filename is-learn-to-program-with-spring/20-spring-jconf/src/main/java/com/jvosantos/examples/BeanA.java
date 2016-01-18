package com.jvosantos.examples;

import org.springframework.beans.factory.BeanNameAware;

public class BeanA implements BeanNameAware {
  private String beanName;

  public BeanA() {
    System.out.println("BeanA()");
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
