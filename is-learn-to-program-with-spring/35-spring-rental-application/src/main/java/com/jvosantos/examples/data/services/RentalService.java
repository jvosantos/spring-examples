package com.jvosantos.examples.data.services;

import com.jvosantos.examples.data.entities.Media;
import com.jvosantos.examples.data.entities.Rental;
import com.jvosantos.examples.data.repositories.MediaRepository;
import com.jvosantos.examples.data.repositories.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class RentalService {
  @Autowired
  private MediaRepository mediaRepository;

  @Autowired
  private RentalRepository rentalRepository;

  @Transactional
  public List<Media> findTitle(String title) {
    return mediaRepository.findByTitleContaining(title);
  }

  @Transactional
  public void rent(Media media) {
    Rental rental = new Rental();

    media.setAvailable(false);

    rental.setPickupDate(new Date());
    rental.setPickupLocation(media.getRentalLocation());
    rental.setMedia(media);

    media.getRentalLocation().getMedias().remove(media);
    media.setRentalLocation(null);

    mediaRepository.save(media);

  }
}
