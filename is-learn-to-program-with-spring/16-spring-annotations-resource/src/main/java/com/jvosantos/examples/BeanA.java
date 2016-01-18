package com.jvosantos.examples;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class BeanA {
  private BeanNameAware beanNameAware;

  public BeanNameAware getBeanNameAware() {
    return beanNameAware;
  }

  @Resource
  @Qualifier("beanC")
  public void setBeanNameAware(BeanNameAware beanNameAware) {
    System.out.println("BeanA::setBeanNameAware(BeanNameAware " + beanNameAware.toString() + ")");
    this.beanNameAware = beanNameAware;
  }
}
