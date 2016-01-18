package com.jvosantos.examples;

import com.jvosantos.examples.data.entities.Media;
import com.jvosantos.examples.data.entities.RentalLocation;
import com.jvosantos.examples.data.services.RentalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class RentalApplication {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");

    RentalService rentalService = applicationContext.getBean(RentalService.class);

    Scanner scanner = new Scanner(System.in);

    System.out.print("Title of a media: ");
    List<Media> titles = rentalService.findTitle(scanner.nextLine());

    if(titles.isEmpty()) {
      System.out.println("Title not found.");
    } else {
      System.out.println("Title found at the following locations: ");

      for(int i = 0; i < titles.size(); i++) {
        System.out.printf("%d. %s%n", i + 1, titles.get(i).getRentalLocation().getName());
      }

      System.out.print("Location to pickup: ");
      Media selected = titles.get(scanner.nextInt() - 1);

      rentalService.rent(selected);
      System.out.printf("Rental of %s confirmed.", selected.getTitle());

    }
  }
}
