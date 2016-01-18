package com.jvosantos.examples.data.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "RENTAL_LOCATION")
public class RentalLocation {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "NAME")
  private String name;

  @Column(name = "ADDRESS1")
  private String address1;

  @Column(name = "ADDRESS2")
  private String address2;

  @Column(name = "CITY")
  private String city;

  @Column(name = "STATE")
  private String state;

  @Column(name = "ZIP_CODE")
  private String zipCode;

  @OneToMany(mappedBy = "rentalLocation")
  @Transient
  private List<Media> medias;

  public RentalLocation() {
    medias = new ArrayList<>();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) { this.id = id; }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public List<Media> getMedias() {
    return medias;
  }

  public void setMedias(List<Media> medias) {
    this.medias = medias;
  }

  @Override public String toString() {
    return "RentalLocation{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", address1='" + address1 + '\'' +
        ", address2='" + address2 + '\'' +
        ", city='" + city + '\'' +
        ", state='" + state + '\'' +
        ", zipCode='" + zipCode + '\'' +
        '}';
  }

}
