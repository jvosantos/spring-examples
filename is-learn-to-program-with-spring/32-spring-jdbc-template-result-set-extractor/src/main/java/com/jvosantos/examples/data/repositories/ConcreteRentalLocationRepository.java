package com.jvosantos.examples.data.repositories;

import com.jvosantos.examples.data.entities.RentalLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class ConcreteRentalLocationRepository implements RentalLocationRepository {

  private JdbcTemplate jdbcTemplate;

  private static final String RENTAL_LOCATION_TABLE = "RENTAL_LOCATION rl";

  private static final String MEDIA_TABLE = "MEDIA m";

  private static final String RENTAL_LOCATION_COLUMNS = "rl.ID as RL_ID, rl.NAME, rl.ADDRESS1, rl.ADDRESS2, rl.CITY, rl.STATE, rl.ZIP_CODE";

  private static final String MEDIA_COLUMNS = "m.ID as M_ID, m.TITLE, m.FORMAT, m.LENGTH, m.RATING, m.AVAILABLE";

  private static final String FIND_BY_STATE_QUERY =
      "select " + RENTAL_LOCATION_COLUMNS + ", " + MEDIA_COLUMNS
          + " from " + RENTAL_LOCATION_TABLE
          + " inner join " + MEDIA_TABLE + " on rl.id = m.rental_location_id"
          + " where rl.STATE = ?";

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
  public List<RentalLocation> findByState(String state) {
    return jdbcTemplate.query(FIND_BY_STATE_QUERY, new Object[] {state}, new RentalLocationResultExtractor());
  }

  @Override
  public RentalLocation findById(Long id) {
    return null;
  }

}
