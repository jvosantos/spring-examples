package com.jvosantos.examples.services;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import javax.inject.Named;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/spring/test-application.xml")
// if using java config rather than xml configuration
//@ContextConfiguration(classes = TestConfiguration.class)
public class PrinterTest {

  @Inject
  @Named("messagePrinter")
  private Printer printer;

  @Test
  public void testSomeStuff() {
    // printer is a proxy and not actually a MessagePrinter
    Assert.assertEquals(false, printer instanceof MessagePrinter);
  }

}
