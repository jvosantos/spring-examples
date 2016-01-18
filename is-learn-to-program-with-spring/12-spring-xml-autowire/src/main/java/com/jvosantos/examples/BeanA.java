package com.jvosantos.examples;

public class BeanA {

	private BeanB beanB;

	private BeanC beanC;

	public BeanA(BeanB beanB) {
		System.out.println("BeanA(BeanB " + beanB.getBeanName() + ")");
		this.beanB = beanB;
	}
	
	public BeanA(BeanB beanB, BeanC beanC) {
		super();
		System.out.println("BeanA(BeanB " + beanB.getBeanName() + ", BeanC " + beanC.getBeanName() + ")");
		this.beanB = beanB;
		this.beanC = beanC;
	}

	public BeanA(BeanB beanB, BeanC beanC, BeanR beanR) {
		super();
		System.out.println("BeanA(BeanB " + beanB.getBeanName() + ", BeanC " + beanC.getBeanName() + ", BeanR " + beanR.getBeanName() + ")");
		this.beanB = beanB;
		this.beanC = beanC;
	}

}
