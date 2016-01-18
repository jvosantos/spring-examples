package com.jvosantos.examples;

import java.util.List;

public interface SourceLocator {

  List<BookStore> find(String zipCode, int radius);

}
