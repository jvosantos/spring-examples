package com.jvosantos.examples;

import org.springframework.beans.factory.BeanNameAware;

public class BeanR implements BeanNameAware {
  private String beanName;

  public String getBeanName() {
    return beanName;
  }

  @Override
  public void setBeanName(String beanName) {
    this.beanName = beanName;
  }
}
