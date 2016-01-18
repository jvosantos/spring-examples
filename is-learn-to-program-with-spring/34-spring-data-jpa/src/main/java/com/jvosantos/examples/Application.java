package com.jvosantos.examples;

import com.jvosantos.examples.data.entities.Media;
import com.jvosantos.examples.data.repositories.MediaRepository;
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

    MediaRepository mediaRepository = applicationContext.getBean(MediaRepository.class);

    Media media = new Media();
    media.setTitle("Fight Club");
    media.setFormat("BluRay");
    media.setRating(5L);
    media.setLength(220L);

    System.out.println("Saving Media " + media.getTitle());
    mediaRepository.save(media);
    System.out.println("Saved!");

    List<Media> mustWatch = mediaRepository.findByRating(5L);

    mustWatch.stream().map(Media::getTitle).forEach(System.out::println);

  }
}
