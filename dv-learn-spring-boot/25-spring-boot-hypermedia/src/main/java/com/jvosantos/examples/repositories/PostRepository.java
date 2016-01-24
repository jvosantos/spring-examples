package com.jvosantos.examples.repositories;

import com.jvosantos.examples.domain.Post;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PostRepository extends PagingAndSortingRepository<Post, Long> {

  List<Post> findByTitleContaining(@Param(value = "title") String title);

  Post findFirstByOrderByPostedOnDesc();

  List<Post> findAllByOrderByPostedOnDesc();

  Post findBySlug(@Param(value = "slug") String slug);
}
