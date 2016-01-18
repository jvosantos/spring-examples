package com.jvosantos.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DigitalMediaLocator implements SourceLocator {

	private static List<BookStore> bookStores = new ArrayList<BookStore>();
	
	static {
		bookStores.add(
				new BookStore("Server A", Arrays.asList("Dungeon Master's Guide", "Player's Handbook")));
		bookStores.add(
				new BookStore("Server B", Arrays.asList("SQL Antipatterns", "Clean Code", "Clean Coder")));
		bookStores.add(new BookStore("Server C",
				Arrays.asList("Grimtooth's Traps", "The Colour of Magic", "The Light Fantastic")));

	}

	@Override
	public List<BookStore> find(String zipCode, int radius) {
		return bookStores;
	}
}
