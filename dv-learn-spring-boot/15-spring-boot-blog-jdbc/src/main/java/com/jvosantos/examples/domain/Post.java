package com.jvosantos.examples.domain;

import java.util.Date;

public class Post {

  private Long id;

  private String title;

  private String slug;

  private String body;

  private String teaser;

  private Date postedOn;

  private Author author;

  public Post() {}

  public Post(Long id, String title, String slug, String body, String teaser, Date postedOn,
      Long authorId) {
    this.id = id;
    this.title = title;
    this.slug = slug;
    this.body = body;
    this.teaser = teaser;
    this.postedOn = postedOn;
    setAuthor(authorId);
  }

  public Long getId() { return id; }

  public void setId(Long id) { this.id = id; }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSlug() { return slug; }

  public void setSlug(String slug) { this.slug = slug; }

  public String getTeaser() { return teaser; }

  public void setTeaser(String teaser) { this.teaser = teaser; }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public Date getPostedOn() {
    return postedOn;
  }

  public void setPostedOn(Date postedOn) {
    this.postedOn = postedOn;
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) { this.author = author; }

  public void setAuthor(Long authorId) {
    this.author = new Author("Vasco", "Santos", "jvosantos@gmail.com");
  }

  @Override
  public String toString() {
    return "Post: " + title;
  }
}
