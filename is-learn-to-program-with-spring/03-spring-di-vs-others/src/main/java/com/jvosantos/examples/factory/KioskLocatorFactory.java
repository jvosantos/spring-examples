package com.jvosantos.examples.factory;

import com.jvosantos.examples.KioskLocator;
import com.jvosantos.examples.SourceLocator;

public class KioskLocatorFactory {

	public static SourceLocator createInstance() {
		return new KioskLocator("key");
	}
}
