package com.jvosantos.examples.domain;

import java.util.List;

public class Author {
  private Long id;

  private String firstName;

  private String lastName;

  private String email;

  private List<Post> posts;

  public Author() {}

  public Author(String firstName, String lastName, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  public Long getId() { return id; }

  public void setId(Long id) { this.id = id; }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() { return email; }

  public void setEmail(String email) { this.email = email; }

  public List<Post> getPosts() {
    return posts;
  }

  public void setPosts(List<Post> posts) {
    this.posts = posts;
  }

  @Override
  public String toString() {
    return firstName + lastName;
  }
}
