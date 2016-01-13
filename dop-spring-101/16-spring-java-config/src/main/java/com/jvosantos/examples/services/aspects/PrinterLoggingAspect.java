package com.jvosantos.examples.services.aspects;

import com.jvosantos.examples.services.audit.Audit;
import com.jvosantos.examples.services.audit.AuditLog;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * MessagePrinterLoggingAspect is declared as a spring component so that spring automaticall detects
 * this class and is an aspect.
 */
@Component @Aspect public class PrinterLoggingAspect {

  /**
   * Define this method as an Advice to be run before the pointcut defined in method
   * PrinterPointcuts.loggingOperation.
   *
   * @param joinPoint
   */
  @Before("PrinterPointcuts.loggingOperation()") public void logBefore(JoinPoint joinPoint) {
    System.out.println("==== Executing " + joinPoint.getSignature() + " ====");
  }

  /**
   * Define this method as an Advice to be run after a return occurs in the pointcut defined in
   * method MessagePrinterPointcuts.loggingOperation
   *
   * @param joinPoint
   * @param returnValue The object returned
   */
  @AfterReturning(value = "PrinterPointcuts.loggingOperation()", returning = "returnValue")
  public void logAfterSuccess(JoinPoint joinPoint, Object returnValue) {
    System.out.println("==== Execution of " + joinPoint.getSignature() + " Done ====");
    System.out.println("==== Object returned: " + returnValue + " ====");
  }

  /**
   * Define this method as an Advice to be run an exception is thrown in the pointcut defined in
   * method MessagePrinterPointcuts.loggingOperation
   *
   * @param joinPoint
   * @param t         the exception thrown.
   */
  @AfterThrowing(value = "PrinterPointcuts.loggingOperation()", throwing = "t")
  public void logAfterFailure(JoinPoint joinPoint, Throwable t) {
    System.out.println("==== Execution of " + joinPoint.getSignature() + " Failed ====");
    System.out.println("==== Reason of failure: " + t.getMessage() + " ====");
  }

  /**
   * Define this method as an Advice to be run after the defined pointcut in method
   * PrinterPointcuts.auditOperations
   *
   * @param joinPoint
   */
  @After(value = "PrinterPointcuts.auditOperations()")
  public void audit(
      final JoinPoint joinPoint) {
    Audit audit = (Audit) joinPoint.getThis();

    audit.addMessage(joinPoint.getSignature().getName());

  }
}
