package com.jvosantos.examples.data.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RENTAL")
public class Rental {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "MEDIA_ID")
  private Media media;

  @ManyToOne
  @JoinColumn(name = "PICKUP_LOCATION_ID")
  private RentalLocation pickupLocation;

  @ManyToOne
  @JoinColumn(name = "RETURN_LOCATION_ID")
  private RentalLocation returnLocation;

  @Temporal(TemporalType.DATE)
  @Column(name = "PICKUP_DATE")
  private Date pickupDate;

  @Temporal(TemporalType.DATE)
  @Column(name = "RETURN_DATE")
  private Date returnDate;

  @Column(name = "CUSTOMER_NAME")
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
