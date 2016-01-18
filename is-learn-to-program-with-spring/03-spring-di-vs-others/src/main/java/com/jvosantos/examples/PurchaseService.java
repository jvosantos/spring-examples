package com.jvosantos.examples;

import java.util.List;
import java.util.stream.Collectors;

public class PurchaseService {

	private SourceLocator sourceLocator;

	public PurchaseService(SourceLocator storeLocator) {
		this.sourceLocator = storeLocator;
	}

	public List<BookStore> find(String title, String zipCode, int miles) {
		List<BookStore> bookStores = sourceLocator.find(zipCode, miles);

		return bookStores.stream().filter(location -> location.getTitles().contains(title))
						.collect(Collectors.toList());
	}
}
