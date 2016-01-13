package com.jvosantos.examples.services.audit;

public interface Audit {
  void addMessage(String message);

  void output();
}
