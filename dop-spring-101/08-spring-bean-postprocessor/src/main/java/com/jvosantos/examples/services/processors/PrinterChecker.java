package com.jvosantos.examples.services.processors;

import com.jvosantos.examples.services.MessagePrinter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;

public class PrinterChecker implements BeanPostProcessor, PriorityOrdered{
  private int order = 0;

  @Override
  public int getOrder() {
    return order;
  }

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {
    if(bean instanceof MessagePrinter) {
      System.out.println("PrinterChecker --> BeforeInitialization: " + beanName);
    }

    return bean;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    if(bean instanceof MessagePrinter) {
      System.out.println("PrinterChecker --> AfterInitialization: " + beanName);
    }

    return bean;
  }

}
