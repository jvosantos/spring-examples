package com.jvosantos.examples;

public class BeanA {

  public BeanA(String value) {
    System.out.println("public BeanA(String " + value + ")");
  }

  public BeanA(String value, String value2) {
    System.out.println("public BeanA(String " + value + ", String " + value2 + ")");
  }

  public BeanA(int value) {
    System.out.println("public BeanA(int " + value + ")");
  }

  public BeanA(BeanB beanB) {
    System.out.println("public BeanA(BeanB " + beanB + ")");
    beanB.execute();
  }
}
