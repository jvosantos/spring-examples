package com.jvosantos.examples.data.entities;

import javax.persistence.*;

@Entity
@Table(name = "MEDIA")
public class Media {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "TITLE")
  private String title;

  @Column(name = "FORMAT")
  private String format;

  @Column(name = "LENGTH")
  private Long length;

  @Column(name = "RATING")
  private Long rating;

  @Column(name = "AVAILABLE")
  private boolean available;

  @ManyToOne
  @JoinColumn(name = "RENTAL_LOCATION_ID")
  private RentalLocation rentalLocation;

  public Media() {}

  public Long getId() {
    return id;
  }

  public void setId(Long id) { this.id = id; }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public Long getLength() {
    return length;
  }

  public void setLength(Long length) {
    this.length = length;
  }

  public Long getRating() {
    return rating;
  }

  public void setRating(Long rating) {
    this.rating = rating;
  }

  public RentalLocation getRentalLocation() {
    return rentalLocation;
  }

  public void setRentalLocation(RentalLocation rentalLocation) {
    this.rentalLocation = rentalLocation;
  }

  public boolean isAvailable() {
    return available;
  }

  public void setAvailable(boolean available) {
    this.available = available;
  }
}
