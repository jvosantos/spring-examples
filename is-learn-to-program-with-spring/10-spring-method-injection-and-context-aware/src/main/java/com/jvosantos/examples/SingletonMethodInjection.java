package com.jvosantos.examples;

public abstract class SingletonMethodInjection {
  private Prototype prototype;

  public abstract Prototype createPrototype();

  public void setPrototype(Prototype prototype) {
    this.prototype = prototype;
  }
}
