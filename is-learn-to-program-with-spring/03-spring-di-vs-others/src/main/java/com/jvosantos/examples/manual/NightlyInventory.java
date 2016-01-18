package com.jvosantos.examples.manual;

import com.jvosantos.examples.KioskLocator;
import com.jvosantos.examples.PurchaseService;

public class NightlyInventory {

	public static void main(String[] args) {
			
		PurchaseService purchaseService = new PurchaseService(new KioskLocator(""));
		
		//Find inventory each night.
	}
}
