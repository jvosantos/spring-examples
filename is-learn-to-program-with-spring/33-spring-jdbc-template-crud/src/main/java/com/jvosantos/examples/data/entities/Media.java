package com.jvosantos.examples.data.entities;

public class Media {
  private Long id;

  private String title;

  private String format;

  private Long length;

  private Long rating;

  private RentalLocation rentalLocation;

  private boolean available;

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
