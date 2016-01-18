package com.jvosantos.examples.data.entities;

import java.util.Date;

public class Rental {

  private Long id;

  private Media media;

  private RentalLocation pickupLocation;

  private RentalLocation returnLocation;

  private Date pickupDate;

  private Date returnDate;

  private String customerName;

  public Rental() {}

  public Long getId() {
    return id;
  }

  public void setId(Long id) { this.id = id; }

  public Media getMedia() {
    return media;
  }

  public void setMedia(Media media) {
    this.media = media;
  }

  public RentalLocation getPickupLocation() {
    return pickupLocation;
  }

  public void setPickupLocation(RentalLocation pickupLocation) {
    this.pickupLocation = pickupLocation;
  }

  public RentalLocation getReturnLocation() {
    return returnLocation;
  }

  public void setReturnLocation(RentalLocation returnLocation) {
    this.returnLocation = returnLocation;
  }

  public Date getPickupDate() {
    return pickupDate;
  }

  public void setPickupDate(Date pickupDate) {
    this.pickupDate = pickupDate;
  }

  public Date getReturnDate() {
    return returnDate;
  }

  public void setReturnDate(Date returnDate) {
    this.returnDate = returnDate;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }
}
