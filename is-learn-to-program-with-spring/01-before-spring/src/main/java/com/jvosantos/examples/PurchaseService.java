package com.jvosantos.examples;

import java.util.List;
import java.util.stream.Collectors;

public class PurchaseService {

  private SourceLocator sourceLocator;

  public PurchaseService(SourceLocator sourceLocator) {
    this.sourceLocator = sourceLocator;
  }

  public List<BookStore> find(String title, String zipcode, int kilometers) {
    List<BookStore> locations = sourceLocator.find(zipcode, kilometers);

    return locations.stream().filter(location -> location.getTitles().contains(title))
        .collect(Collectors.toList());
  }
}
