package com.jvosantos.examples.services.audit;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class AuditLog implements Audit {

  private List<String> log = new ArrayList<>();

  @Override
  public void addMessage(String message) {
    final Date now = GregorianCalendar.getInstance().getTime();
    log.add(now.toString() + " - " + message);
  }

  @Override
  public void output() {
    System.out.println(" ---- Audit log start ----");
    log.forEach(System.out::println);
    System.out.println(" ---- Audit log end ----");
  }
}
