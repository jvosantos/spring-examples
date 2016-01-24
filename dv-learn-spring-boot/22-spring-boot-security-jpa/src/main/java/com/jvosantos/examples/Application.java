package com.jvosantos.examples;

import com.jvosantos.examples.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application {

  @Autowired
  private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
  private void printData() {

    System.out.println("Testing...");
    userRepository.findAll().forEach(user -> {
      System.out.println("User: " + user.getEmail() + " roles{" + user.getRoles() + "}");
    });
  }
}
