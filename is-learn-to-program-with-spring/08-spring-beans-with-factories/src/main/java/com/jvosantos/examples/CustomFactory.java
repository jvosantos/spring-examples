package com.jvosantos.examples;

public class CustomFactory {
  private CustomFactory() {
    System.out.println("CustomFactory()");
  }

  public BeanB getBeanBInstance() {
    System.out.println("BeanB::getBeanBInstance()");
    return new BeanB();
  }
}
