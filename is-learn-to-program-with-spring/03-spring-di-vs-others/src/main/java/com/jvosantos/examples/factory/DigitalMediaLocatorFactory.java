package com.jvosantos.examples.factory;


import com.jvosantos.examples.DigitalMediaLocator;
import com.jvosantos.examples.SourceLocator;

public class DigitalMediaLocatorFactory {

	public static SourceLocator createInstance() {
		return new DigitalMediaLocator();
	}
}
