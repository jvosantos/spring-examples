package com.jvosantos.examples.services;

import com.jvosantos.examples.models.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {
  @Bean
  public Message sundayMessage() {
    Message message = new Message();
    message.setMessage("Sunday - crap, tomorrow you gotta work.");
    return message;
  }

  @Bean
  public Message mondayMessage() {
    Message message = new Message();
    message.setMessage("Monday - crap!");
    return message;
  }

  @Bean
  public Message tuesdayMessage() {
    Message message = new Message();
    message.setMessage("Tuesday - ...");
    return message;
  }

  @Bean
  public Message wednesdayMessage() {
    Message message = new Message();
    message.setMessage("Wednesday - Middle of the week, don't despair.");
    return message;
  }

  @Bean
  public Message thursMessage() {
    Message message = new Message();
    message.setMessage("Thursday - Better finish your work today.");
    return message;
  }

  @Bean
  public Message fridayMessage() {
    Message message = new Message();
    message.setMessage("Friday - Yay, Drink night");
    return message;
  }
  @Bean
  public Message staurdayMessage() {
    Message message = new Message();
    message.setMessage("Saturday - Try not to stay in the couch all day");
    return message;
  }

}
