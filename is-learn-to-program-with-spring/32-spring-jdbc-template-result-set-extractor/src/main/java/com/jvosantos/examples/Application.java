package com.jvosantos.examples;

import com.jvosantos.examples.data.entities.Media;
import com.jvosantos.examples.data.entities.RentalLocation;
import com.jvosantos.examples.data.repositories.RentalLocationRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class Application {
  public static void main(String[] args) {
    ApplicationContext applicationContext =
        new ClassPathXmlApplicationContext("application-context.xml");

    RentalLocationRepository rentalLocationRepository =
        applicationContext.getBean(RentalLocationRepository.class);

    List<RentalLocation> rentalLocationList = rentalLocationRepository.findByState("Florida");

    rentalLocationList.stream().forEach(rentalLocation -> {
      System.out.println("location name: " + rentalLocation.getName());
      rentalLocation.getMedias().stream().map(Media::getTitle).forEach(mediaTitle -> System.out.println("\tmedia title: " + mediaTitle));
    });
  }
}
