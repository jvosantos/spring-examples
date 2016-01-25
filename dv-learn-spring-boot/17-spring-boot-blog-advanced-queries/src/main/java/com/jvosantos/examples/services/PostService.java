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

  public Iterable<Post> list() {
    return postRepository.findAll();
  }

  public List<Post> byAuthor(String firstName) {
    return postRepository.findAllByAuthorFirstNameIgnoreCaseOrderByPostedOnDesc(firstName);
  }

  public List<Post> byKeyword(String keyword) {
    return postRepository.findAllByKeywordsLikeIgnoreCase('%' + keyword + '%');
  }

  public List<Post> findActive() {
    return postRepository.findAllByActiveTrue();
  }

  public Post findBySlug(String slug) {
    return postRepository.findPostBySlug(slug);
  }
}
