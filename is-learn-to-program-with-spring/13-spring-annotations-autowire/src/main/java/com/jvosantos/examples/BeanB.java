package com.jvosantos.examples;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;


public class BeanB implements BeanNameAware {

  private String beanName;
  private BeanD beanD;

  public BeanB() {
    System.out.println("BeanB()");
  }

  public BeanD getBeanD() {
    return beanD;
  }

  @Autowired
  public void setBeanD(BeanD beanD) {
    System.out.println("BeanB::setBeanD(BeanD " + beanD.getBeanName() + ")");
    this.beanD = beanD;
  }

  public String getBeanName() {
    return beanName;
  }

  @Override
  public void setBeanName(String beanName) {
    this.beanName = beanName;
  }
}
