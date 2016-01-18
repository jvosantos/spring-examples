package com.jvosantos.examples.data.repositories;

import com.jvosantos.examples.data.entities.RentalLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class ConcreteRentalLocationRepository implements RentalLocationRepository {

  private JdbcTemplate jdbcTemplate;

  private static final String SIMPLE_QUERY = "select name from RENTAL_LOCATION where ID = ?";

  @Override
  public String findNameById(Integer id) {
    return jdbcTemplate.queryForObject(SIMPLE_QUERY, new Object[] {id}, String.class);
  }

  @Autowired
  public ConcreteRentalLocationRepository(DataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }

  @Override
  public void insert(RentalLocation rentalLocation) {

  }

  @Override
  public void update(RentalLocation rentalLocation) {

  }

  @Override
  public void delete(RentalLocation rentalLocation) {

  }

  @Override
  public RentalLocation findById() {
    return null;
  }
}
