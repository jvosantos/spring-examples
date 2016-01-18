package com.jvosantos.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoreLocator implements SourceLocator {

  private static List<BookStore> locations = new ArrayList<BookStore>();

  static {
    locations
        .add(new BookStore("Amazon", Arrays.asList("Dungeon Master's Guide", "Player's Handbook")));
    locations.add(new BookStore("Book Depository",
        Arrays.asList("SQL Antipatterns", "Clean Code", "The Clean Coder")));
    locations.add(new BookStore("Abe Books",
        Arrays.asList("Grimtooth's Traps", "The Colour of Magic", "The Light Fantastic", "The Clean Coder")));
  }

  @Override
  public List<BookStore> find(String zipCode, int radius) {
    return locations;
  }

}
