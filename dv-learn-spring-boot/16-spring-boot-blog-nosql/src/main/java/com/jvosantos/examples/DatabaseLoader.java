package com.jvosantos.examples;

import com.jvosantos.examples.domain.Author;
import com.jvosantos.examples.domain.Post;
import com.jvosantos.examples.repositories.AuthorRepository;
import com.jvosantos.examples.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.Date;

public class DatabaseLoader {
  private PostRepository postRepository;

  private AuthorRepository authorRepository;

  @Autowired
  public DatabaseLoader(PostRepository postRepository, AuthorRepository authorRepository) {
    this.postRepository = postRepository;
    this.authorRepository = authorRepository;
  }

  @PostConstruct
  public void initDatabase() {
    authorRepository.deleteAll();

    Author author = new Author();

    author.setFirstName("Vasco");
    author.setLastName("Santos");
    author.setEmail("jvosantos@gmail.com");

    authorRepository.save(author);

    Post post = new Post();
    post.setTitle("Spring Data Rocks!");
    post.setSlug("spring-data-rocks");
    post.setTeaser("Post Teaser");
    post.setPostedOn(new Date());
    post.setAuthor(author);

    postRepository.save(post);
  }
}
