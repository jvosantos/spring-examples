package com.jvosantos.examples.services.processors;

import com.jvosantos.examples.services.MessageOfTheDayService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;

public class MessageChecker implements BeanPostProcessor, PriorityOrdered {
  private int order = 0;

  @Override
  public int getOrder() {
    return order;
  }

  public void setOrder(int order) {
    this.order = order;
  }

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {
    if (bean instanceof MessageOfTheDayService) {
      MessageOfTheDayService messageOfTheDayService = (MessageOfTheDayService) bean;
      if (!messageOfTheDayService.getMessage().isEmpty()) {
        System.out.println("MessageChecker --> Before initialization: " + beanName + " contains "
            + messageOfTheDayService.getMessage());
      }
    }

    return bean;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    if (bean instanceof MessageOfTheDayService) {
      MessageOfTheDayService messageOfTheDayService = (MessageOfTheDayService) bean;
      if (!messageOfTheDayService.getMessage().isEmpty()) {
        System.out.println("MessageChecker --> After initialization: " + beanName + " contains "
            + messageOfTheDayService.getMessage());
      }
    }

    return bean;
  }
}
