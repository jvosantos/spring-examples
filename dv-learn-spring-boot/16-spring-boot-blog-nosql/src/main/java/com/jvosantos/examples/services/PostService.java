package com.jvosantos.examples.services;

import com.jvosantos.examples.domain.Post;
import com.jvosantos.examples.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

  private PostRepository postRepository;

  @Autowired
  public PostService(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public Post getLatestPost() {
    return postRepository.findFirstByOrderByPostedOnDesc();
  }

  public List<Post> list() {
    return postRepository.findAllByOrderByPostedOnDesc();
  }

  public Post getPostBySlug(String slug) {
    return postRepository.findBySlug(slug);
  }
}
