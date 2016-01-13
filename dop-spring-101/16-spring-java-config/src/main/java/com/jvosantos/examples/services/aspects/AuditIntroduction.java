package com.jvosantos.examples.services.aspects;

import com.jvosantos.examples.services.audit.Audit;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Introductions add functionality to some object
 */
@Component
@Aspect
public class AuditIntroduction {
  /**
   * Adds audit as a super interface of printer..
   */
  @DeclareParents(value = "com.jvosantos.examples.services.*Printer", defaultImpl = com.jvosantos.examples.services.audit.AuditLog.class)
  public Audit audit;
}
