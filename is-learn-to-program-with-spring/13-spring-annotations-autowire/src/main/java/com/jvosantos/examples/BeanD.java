package com.jvosantos.examples;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class BeanD implements BeanNameAware {

  private String property;

  private String beanName;

  public BeanD() {
    System.out.println("BeanD()");
  }

  @Override
  public void setBeanName(String beanName) {
    this.beanName = beanName;
  }

  public String getBeanName() {
    return beanName;
  }

  public String getProperty() {
    return property;
  }

  @Required
  @Value("value")
  public void setProperty(String property) {
    this.property = property;
  }
}
