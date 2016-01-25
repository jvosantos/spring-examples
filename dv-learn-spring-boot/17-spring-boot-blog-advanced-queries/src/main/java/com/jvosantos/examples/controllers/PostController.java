package com.jvosantos.examples.controllers;

import com.jvosantos.examples.domain.Post;
import com.jvosantos.examples.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
  private PostService postService;

  @Autowired
  public PostController(PostService postService) {
    this.postService = postService;
  }

  @RequestMapping("/")
  public Iterable<Post> list() {
    return postService.list();
  }

  @RequestMapping("/byAuthor/{firstName}")
  public List<Post> byAuthor(@PathVariable(value = "firstName") String firstName) {
    return postService.byAuthor(firstName);
  }

  @RequestMapping("/byKeyword/{keyword}")
  public List<Post> byKeyword(@PathVariable(value = "keyword") String keyword) {
    return postService.byKeyword(keyword);
  }

  @RequestMapping("/active")
  public List<Post> active() {
    return postService.findActive();
  }

  @RequestMapping("/slug/{slug}")
  public Post findPostBySlug(@PathVariable(value = "slug") String slug) {
    return postService.findBySlug(slug);
  }


}
