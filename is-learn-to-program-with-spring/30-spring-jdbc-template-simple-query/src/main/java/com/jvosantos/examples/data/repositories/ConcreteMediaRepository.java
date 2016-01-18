package com.jvosantos.examples.data.repositories;

import com.jvosantos.examples.data.entities.Media;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class ConcreteMediaRepository implements MediaRepository {

  private JdbcTemplate jdbcTemplate;

  @Autowired
  public ConcreteMediaRepository(DataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }

  @Override
  public void insert(Media media) {

  }

  @Override
  public void update(Media media) {

  }

  @Override
  public void delete(Media media) {

  }

  @Override
  public Media findById() {
    return null;
  }
}
