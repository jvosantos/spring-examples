package com.jvosantos.examples.data.repositories;

import com.jvosantos.examples.data.entities.RentalLocation;

import java.util.List;

public interface RentalLocationRepository extends Repo<RentalLocation, Long> {
  List<RentalLocation> findByState(String state);
}
