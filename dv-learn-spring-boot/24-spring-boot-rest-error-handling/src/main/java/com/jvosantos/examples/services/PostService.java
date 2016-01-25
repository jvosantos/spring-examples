package com.jvosantos.examples.services;

import com.jvosantos.examples.domain.Post;

public interface PostService {

  Iterable<Post> list();

  Post create(Post post);

  Post read(long id);

  Post update(long id, Post post);

  void delete(long id);
}
