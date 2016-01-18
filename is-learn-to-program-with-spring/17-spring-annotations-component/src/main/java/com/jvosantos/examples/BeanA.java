package com.jvosantos.examples;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
  private BeanNameAware beanNameAware;

  public BeanNameAware getBeanNameAware() {
    return beanNameAware;
  }

  @Autowired
  @Qualifier("beanC")
  public void setBeanNameAware(BeanNameAware beanNameAware) {
    System.out.println("BeanA::setBeanNameAware(BeanNameAware " + beanNameAware.toString() + ")");
    this.beanNameAware = beanNameAware;
  }
}
