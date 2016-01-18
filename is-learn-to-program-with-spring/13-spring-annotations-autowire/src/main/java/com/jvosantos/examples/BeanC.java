package com.jvosantos.examples;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;

public class BeanC implements BeanNameAware {
  private String beanName;
  private BeanD beanD;

  public BeanC() {
    System.out.println("BeanC()");
  }

  public String getBeanName() {
    return beanName;
  }

  @Override
  public void setBeanName(String beanName) { this.beanName = beanName; }

  public BeanD getBeanD() {
    return beanD;
  }

  @Autowired
  public void setBeanD(BeanD beanD) {
    System.out.println("BeanC::setBeanD(BeanD " + beanD.getBeanName() + ")");
    this.beanD = beanD;
  }
}
