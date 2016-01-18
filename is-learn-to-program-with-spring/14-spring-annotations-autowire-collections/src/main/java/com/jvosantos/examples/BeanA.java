package com.jvosantos.examples;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class BeanA {
  private BeanB[] beanBArray;

  private List<BeanB> beanBList;

  private Map<String, BeanB> beanBMap;

  public BeanB[] getBeanBArray() {
    return beanBArray;
  }

  @Autowired
  public void setBeanBArray(BeanB[] beanBArray) {
    this.beanBArray = beanBArray;
  }

  public List<BeanB> getBeanBList() {
    return beanBList;
  }

  @Autowired
  public void setBeanBList(List<BeanB> beanBList) {
    this.beanBList = beanBList;
  }

  public Map<String, BeanB> getBeanBMap() {
    return beanBMap;
  }

  @Autowired
  public void setBeanBMap(Map<String, BeanB> beanBMap) {
    this.beanBMap = beanBMap;
  }
}
