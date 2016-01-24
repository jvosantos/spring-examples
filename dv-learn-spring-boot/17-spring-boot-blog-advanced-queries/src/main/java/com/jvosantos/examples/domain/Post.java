package com.jvosantos.examples.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.jvosantos.examples.JsonDateSerializer;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Entity
public class Post {

  @Id
  @GeneratedValue
  private BigInteger id;

  private String title;

  private String slug;

  @Column(columnDefinition = "TEXT")
  private String teaser;

  @Column(columnDefinition = "TEXT")
  private String body;

  @Temporal(TemporalType.TIMESTAMP)
  private Date postedOn;

  @ElementCollection
  private List<String> keywords;

  private Boolean active;

  @ManyToOne
  private Author author;

  private Post() {}

  public Post(String title) {
    this.title = title;
  }

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

  @JsonSerialize(using = JsonDateSerializer.class)
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

  public List<String> getKeywords() { return keywords; }

  public void setKeywords(List<String> keywords) { this.keywords = keywords; }

  public Boolean getActive() { return active; }

  public void setActive(Boolean active) { this.active = active; }

  @Override
  public String toString() {
    return "Post: " + title;
  }
}
