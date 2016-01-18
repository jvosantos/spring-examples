package com.jvosantos.examples;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanA {

  private BeanB beanB;
  private BeanC beanC;

  @Autowired(required = false)
  public BeanA(BeanB beanB) {
    System.out.println("BeanA(BeanB " + beanB.getBeanName() + ")");
    this.beanB = beanB;
  }

  @Autowired(required = false)
  public BeanA(BeanB beanB, BeanC beanC) {
    super();
    System.out
        .println("BeanA(BeanB " + beanB.getBeanName() + ", BeanC " + beanC.getBeanName() + ")");
    this.beanB = beanB;
    this.beanC = beanC;
  }

  @Autowired(required = false)
  public BeanA(BeanB beanB, BeanC beanC, BeanR beanR) {
    super();
    System.out.println(
        "BeanA(BeanB " + beanB.getBeanName() + ", BeanC " + beanC.getBeanName() + ", BeanR " + beanR
            .getBeanName() + ")");
    this.beanB = beanB;
    this.beanC = beanC;
  }

  public BeanB getBeanB() {
    return beanB;
  }

  public void setBeanB(BeanB beanB) {
    this.beanB = beanB;
  }

  public BeanC getBeanC() {
    return beanC;
  }

  public void setBeanC(BeanC beanC) {
    this.beanC = beanC;
  }

}
