package com.jvosantos.examples;

import com.jvosantos.examples.data.entities.RentalLocation;
import com.jvosantos.examples.data.repositories.RentalLocationRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class Application {
  public static void main(String[] args) {
    ApplicationContext applicationContext =
        new ClassPathXmlApplicationContext("application-context.xml");

    RentalLocationRepository rentalLocationRepository = applicationContext.getBean(RentalLocationRepository.class);

    RentalLocation rentalLocation = rentalLocationRepository.findById(new Long(1));

    System.out.println(rentalLocation);

    List<RentalLocation> rentalLocationList = rentalLocationRepository.findByState("Florida");

    rentalLocationList.stream().forEach(System.out::println);
  }
}
