package com.jvosantos.examples.services;

import com.jvosantos.examples.domain.Author;
import com.jvosantos.examples.domain.Post;
import com.jvosantos.examples.repositories.AuthorRepository;
import com.jvosantos.examples.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

@Service
public class DataLoader {
  private PostRepository postRepository;
  private AuthorRepository authorRepository;

  @Autowired
  public DataLoader(PostRepository postRepository, AuthorRepository authorRepository) {
    this.postRepository = postRepository;
    this.authorRepository = authorRepository;
  }

  @PostConstruct
  private void loadData() {
    Author author = new Author("Vasco", "Santos");

    authorRepository.save(author);

    Post post1 = new Post("Hello World!");
    post1.setBody("Well then, we meet again..");
    post1.setPostedOn(new Date());
    post1.setAuthor(author);

    postRepository.save(post1);

    Post post2 = new Post("Refactored Hello World!");
    post2.setBody("There can be only one!!!!!");
    post2.setPostedOn(new Date());
    post2.setAuthor(author);

    postRepository.save(post2);
  }
}
