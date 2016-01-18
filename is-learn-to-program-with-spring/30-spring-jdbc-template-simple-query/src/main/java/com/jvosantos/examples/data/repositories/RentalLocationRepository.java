package com.jvosantos.examples.data.repositories;

import com.jvosantos.examples.data.entities.RentalLocation;

public interface RentalLocationRepository extends Repo<RentalLocation> {
  String findNameById(Integer id);
}
