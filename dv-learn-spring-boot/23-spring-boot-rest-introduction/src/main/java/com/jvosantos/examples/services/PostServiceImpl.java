package com.jvosantos.examples.services;

import com.jvosantos.examples.domain.Post;
import com.jvosantos.examples.repositories.AuthorRepository;
import com.jvosantos.examples.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PostServiceImpl implements PostService {

  private PostRepository postRepository;
  private AuthorRepository authorRepository;

  @Autowired
  public PostServiceImpl(PostRepository postRepository, AuthorRepository authorRepository) {
    this.postRepository = postRepository;
    this.authorRepository = authorRepository;
  }

  @Override
  public Iterable<Post> list() {
    return postRepository.findAll();
  }

  @Override
  @Transactional
  public Post create(Post post) {
    authorRepository.save(post.getAuthor());
    return postRepository.save(post);
  }

  @Override
  public Post read(long id) {
    return postRepository.findOne(id);
  }

  @Override
  public Post update(long id, Post post) {
    post.setAuthor(authorRepository.findByEmail(post.getAuthor().getEmail()));
    return postRepository.save(post);
  }

  @Override
  public void delete(long id) {
    postRepository.delete(id);
  }
}
