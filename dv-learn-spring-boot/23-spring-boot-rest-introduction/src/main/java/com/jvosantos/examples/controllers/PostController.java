package com.jvosantos.examples.controllers;

import com.jvosantos.examples.domain.Post;
import com.jvosantos.examples.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostController {

  private PostService postService;

  @Autowired
  public PostController(PostService postService) {
    this.postService = postService;
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public Iterable<Post> list() {
    return postService.list();
  }

  @RequestMapping(value = "/", method = RequestMethod.POST)
  public Post create(@RequestBody Post post) {
    return postService.create(post);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Post read(@PathVariable(value = "id") long id) {
    return postService.read(id);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public Post update(@PathVariable(value = "id") long id, @RequestBody Post post) {
    return postService.update(id, post);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void delete(@PathVariable(value = "id") long id) {
    postService.delete(id);
  }
}
