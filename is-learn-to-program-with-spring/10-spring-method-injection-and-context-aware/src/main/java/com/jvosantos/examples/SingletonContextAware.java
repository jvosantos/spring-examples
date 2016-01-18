package com.jvosantos.examples;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SingletonContextAware implements ApplicationContextAware {

  private Prototype prototype;
  private ApplicationContext applicationContext;

  public Prototype createPrototype() {
    return applicationContext.getBean("prototype", Prototype.class);
  }

  public void setPrototype(Prototype prototype) {
    this.prototype = prototype;
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext)
      throws BeansException {
    this.applicationContext = applicationContext;
  }
}
