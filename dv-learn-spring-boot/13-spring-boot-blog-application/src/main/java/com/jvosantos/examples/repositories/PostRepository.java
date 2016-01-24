package com.jvosantos.examples.repositories;

import com.jvosantos.examples.domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
  Post findFirstByOrderByPostedOnDesc();

  List<Post> findAllByOrderByPostedOnDesc();

  Post findBySlug(String slug);
}
