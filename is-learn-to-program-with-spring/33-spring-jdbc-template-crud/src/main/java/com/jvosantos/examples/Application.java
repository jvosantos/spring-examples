package com.jvosantos.examples;

import com.jvosantos.examples.data.entities.RentalLocation;
import com.jvosantos.examples.data.repositories.RentalLocationRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String[] args) {
    ApplicationContext applicationContext =
        new ClassPathXmlApplicationContext("application-context.xml");

    RentalLocationRepository rentalLocationRepository =
        applicationContext.getBean(RentalLocationRepository.class);

    RentalLocation rentalLocation = new RentalLocation();

    rentalLocation.setName("Book Depository");
    rentalLocation.setAddress1("Thames Central, Hatfield RD");
    rentalLocation.setCity("Berkshire");
    rentalLocation.setState("United Kingdom");
    rentalLocation.setZipCode("SL1 1QE");

    System.out.println("Inserting " + rentalLocation);
    rentalLocationRepository.insert(rentalLocation);

    System.out.println("Rental Location inserted with id " + rentalLocation.getId());

    System.out.println("Updating State of " + rentalLocation);
    rentalLocation.setState("London");
    rentalLocationRepository.update(rentalLocation);
    System.out.println("Updated " + rentalLocation);

    System.out.println("Deleting " + rentalLocation);
    rentalLocationRepository.delete(rentalLocation);
    System.out.println("Deleted!");


  }
}
