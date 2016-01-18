package com.jvosantos.examples.data.repositories;

import com.jvosantos.examples.data.entities.RentalLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalLocationRepository extends JpaRepository<RentalLocation, Long> {
}
