package com.jvosantos.examples.services.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * MessagePrinterPointcuts is a spring component, so that spring can automatically detect this class
 * and an aspect, allowing it to "intercept"
 */
@Component
@Aspect
public class PrinterPointcuts {
  /**
   * Pointcut configures this method to be run before any method on MessagePrinter with any number
   * of arguments and any access modifier.
   */
  @Pointcut("execution(* com.jvosantos.examples.services.Printer.*(..))")
  public void loggingOperation() {}

  @Pointcut("execution(* com.jvosantos.examples.services.Printer.*(..))")
  public void auditOperations() {}

}
