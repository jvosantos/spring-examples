package com.jvosantos.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KioskLocator implements SourceLocator {


	private static List<BookStore> bookStores = new ArrayList<BookStore>();
	
	
	public KioskLocator(String key) {
	}

	static {
		bookStores
				.add(new BookStore("Kiosk 1", Arrays.asList("Dungeon Master's Guide", "Player's Handbook")));
		bookStores.add(new BookStore("Kiosk 2",
				Arrays.asList("SQL Antipatterns", "Clean Code", "The Clean Coder")));
		bookStores.add(new BookStore("Kiosk 3",
				Arrays.asList("Grimtooth's Traps", "The Colour of Magic", "The Light Fantastic", "The Clean Coder")));
	}

	@Override
	public List<BookStore> find(String zipCode, int radius) {
		return bookStores;
	}

}
