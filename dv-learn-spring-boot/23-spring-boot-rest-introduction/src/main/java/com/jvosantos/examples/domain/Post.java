package com.jvosantos.examples.domain;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

  @Id
  @GeneratedValue
  private Long id;

  private String title;

  private String slug;

  @Column(columnDefinition = "TEXT")
  private String teaser;

  @Column(columnDefinition = "TEXT")
  private String body;

  @CreatedDate
  @Temporal(TemporalType.TIMESTAMP)
  private Date postedOn;

  @ManyToOne
  private Author author;

  private Post() {}

  public Post(String title, String slug, String teaser, String body, Date postedOn, Author author) {
    this.title = title;
    this.slug = slug;
    this.teaser = teaser;
    this.body = body;
    this.postedOn = postedOn;
    this.author = author;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSlug() { return slug; }

  public void setSlug(String slug) { this.slug = slug; }

  public String getTeaser() {
    return teaser;
  }

  public void setTeaser(String teaser) {
    this.teaser = teaser;
  }

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

  public void setAuthor(Author author) {
    this.author = author;
  }

  @Override
  public String toString() {
    return title;
  }
}
