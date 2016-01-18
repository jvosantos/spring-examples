package com.jvosantos.examples;

import java.util.List;

public class BookStore {

  private List<String> titles;
  private String name;

  public BookStore(String name, List<String> titles) {
    this.titles = titles;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getTitles() {
    return titles;
  }

  public void setTitles(List<String> titles) {
    this.titles = titles;
  }
}
