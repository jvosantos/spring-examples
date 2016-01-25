package com.jvosantos.examples.services;

import com.jvosantos.examples.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
  private JavaMailSender javaMailSender;

  @Autowired
  public NotificationService(JavaMailSender javaMailSender) {
    this.javaMailSender = javaMailSender;
  }

  public void sendNotification(User user) throws MailException {
    // send mail
    SimpleMailMessage mail = new SimpleMailMessage();

    mail.setFrom("jvosantos@gmail.com");
    mail.setTo(user.getEmail());
    mail.setSubject("Welcome");
    mail.setText("This is a cool email notification");

    javaMailSender.send(mail);
  }
}
