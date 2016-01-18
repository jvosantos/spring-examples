package com.jvosantos.examples;

import com.jvosantos.examples.data.repositories.RentalLocationRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {
  public static void main(String[] args) {
    ApplicationContext applicationContext =
        new ClassPathXmlApplicationContext("application-context.xml");

    RentalLocationRepository rentalLocationRepository = applicationContext.getBean(RentalLocationRepository.class);

    System.out.println(rentalLocationRepository.findNameById(new Integer(8)));
  }
}
