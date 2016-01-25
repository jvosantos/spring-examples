package com.jvosantos.examples.controllers;

import com.jvosantos.examples.domain.User;
import com.jvosantos.examples.services.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

  private Logger logger = LoggerFactory.getLogger(RegistrationController.class);

  private NotificationService notificationService;

  @Autowired
  public RegistrationController(NotificationService notificationService) {
    this.notificationService = notificationService;
  }

  @RequestMapping("/signup")
  public String signup() {
    return "Please sign up for our service.";
  }

  @RequestMapping("/signup-success")
  public String signupSuccess() {

    // create user
    User user = new User();

    user.setFirstName("Vasco");
    user.setLastName("Santos");
    user.setEmail("jvosantos@gmail.com");

    // send a notification
    try {
      notificationService.sendNotification(user);
    } catch (MailException e) {
      // catch error
      logger.error("Error Sending email: " + e.getMessage());
    }

    return "Thank you for registering with us.";
  }
}
