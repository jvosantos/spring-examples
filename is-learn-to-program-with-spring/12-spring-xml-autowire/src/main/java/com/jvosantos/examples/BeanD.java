package com.jvosantos.examples;

import org.springframework.beans.factory.BeanNameAware;

public class BeanD implements BeanNameAware {

	private String beanName;

	public BeanD() {
		System.out.println("BeanD()");
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public String getBeanName() {
		return beanName;
	}

}
