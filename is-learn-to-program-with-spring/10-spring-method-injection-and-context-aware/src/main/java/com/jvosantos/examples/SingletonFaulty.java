package com.jvosantos.examples;

public class SingletonFaulty {
  private Prototype prototype;

  public Prototype createPrototype() {
    return prototype;
  }

  public void setPrototype(Prototype prototype) {
    this.prototype = prototype;
  }
}
