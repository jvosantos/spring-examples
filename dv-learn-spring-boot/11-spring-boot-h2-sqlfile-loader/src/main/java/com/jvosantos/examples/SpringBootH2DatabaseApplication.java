package com.jvosantos.examples;

import com.jvosantos.examples.repositories.PostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootH2DatabaseApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringBootH2DatabaseApplication.class);

  @Autowired
  private PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootH2DatabaseApplication.class, args);
	}

  @PostConstruct
  private void seePosts() {
    logger.info("seePosts entry");

    postRepository.findAll().forEach(post -> logger.info(post.toString()));

    logger.info("");
  }
}
