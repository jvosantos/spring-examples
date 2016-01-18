package com.jvosantos.examples;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB implements BeanNameAware {
  private String beanName;

  private BeanC beanC;

  public BeanB() {
    System.out.println("BeanB()");
  }

  public BeanC getBeanC() {
    return beanC;
  }

  @Autowired
  public void setBeanC(BeanC beanC) {
    System.out.println(beanName + ".setBeanC(BeanC " + beanC.getBeanName() + ")");
    this.beanC = beanC;
  }

  public String getBeanName() {
    return beanName;
  }

  @Override
  public void setBeanName(String beanName) {
    this.beanName = beanName;
  }
}
