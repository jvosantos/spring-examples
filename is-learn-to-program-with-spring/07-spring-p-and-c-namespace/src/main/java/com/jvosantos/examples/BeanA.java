package com.jvosantos.examples;

public class BeanA {
  private int someInt;
  private BeanB beanB;

  public BeanA() {}

  public int getSomeInt() {
    return someInt;
  }

  public void setSomeInt(int someInt) {
    System.out.println("BeanA::setSomeInt(int " + someInt + ")");
    this.someInt = someInt;
  }

  public BeanB getBeanB() {
    return beanB;
  }

  public void setBeanB(BeanB beanB) {
    System.out.println("BeanA::setBeanB(BeanB " + beanB + ")");
    this.beanB = beanB;
  }
}
