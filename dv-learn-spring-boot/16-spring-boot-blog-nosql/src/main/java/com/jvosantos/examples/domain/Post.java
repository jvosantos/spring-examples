package com.jvosantos.examples.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.Date;

@Document
public class Post {

  @Id
  private BigInteger id;

  private String title;

  private String slug;

  private String body;

  private String teaser;

  private Date postedOn;

  private Author author;

  public Post() {}

  public BigInteger getId() { return id; }

  public void setId(BigInteger id) { this.id = id; }

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

  @Override
  public String toString() {
    return "Post: " + title;
  }
}
