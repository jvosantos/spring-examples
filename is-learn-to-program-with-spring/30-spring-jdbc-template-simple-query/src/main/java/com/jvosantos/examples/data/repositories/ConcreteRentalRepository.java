package com.jvosantos.examples.data.repositories;

import com.jvosantos.examples.data.entities.Rental;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class ConcreteRentalRepository implements RentalRepository {

  private JdbcTemplate jdbcTemplate;

  @Autowired
  public ConcreteRentalRepository(DataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }

  @Override
  public void insert(Rental rental) {

  }

  @Override
  public void update(Rental rental) {

  }

  @Override
  public void delete(Rental rental) {

  }

  @Override
  public Rental findById() {
    return null;
  }
}
