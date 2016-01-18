package com.jvosantos.examples.data.repositories;

import com.jvosantos.examples.data.entities.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MediaRepository extends JpaRepository<Media, Long> {
  List<Media> findByTitleLikeAndAvailableIsTrue(String title);

  List<Media> findByRating(Long rating);

  List<Media> findByTitleContaining(String title);
}
