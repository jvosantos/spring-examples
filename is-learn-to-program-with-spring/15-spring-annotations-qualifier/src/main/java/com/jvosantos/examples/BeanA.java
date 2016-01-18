package com.jvosantos.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BeanA {
  private BeanB beanB;

  public BeanB getBeanB() {
    return beanB;
  }

  @Autowired
  @Qualifier("beanB2")
  public void setBeanB(BeanB beanB) {
    System.out.println("BeanA::setBeanB(BeanB " + beanB.getBeanName() + ")");
    this.beanB = beanB;
  }
}
