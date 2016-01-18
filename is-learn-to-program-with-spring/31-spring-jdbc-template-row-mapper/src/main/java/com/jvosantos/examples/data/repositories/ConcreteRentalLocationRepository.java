package com.jvosantos.examples.data.repositories;

import com.jvosantos.examples.data.entities.RentalLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ConcreteRentalLocationRepository implements RentalLocationRepository {

  private JdbcTemplate jdbcTemplate;

  private static final String TABLE = "RENTAL_LOCATION";

  private static final String COLUMNS = "ID, NAME, ADDRESS1, ADDRESS2, CITY, STATE, ZIP_CODE";

  private static final String FIND_BY_ID_QUERY = "select " + COLUMNS + " from " + TABLE + " where ID = ?";

  private static final String FIND_BY_STATE_QUERY = "select " + COLUMNS + " from " + TABLE + " where STATE = ?";

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
    return jdbcTemplate.query(FIND_BY_STATE_QUERY, new Object[] {state}, new RentalLocationRowMapper());
  }

  @Override
  public RentalLocation findById(Long id) {
    return jdbcTemplate.queryForObject(FIND_BY_ID_QUERY, new Object[] {id}, new RentalLocationRowMapper());
  }

  private static class RentalLocationRowMapper implements RowMapper<RentalLocation> {
    @Override
    public RentalLocation mapRow(ResultSet resultSet, int i) throws SQLException {
      RentalLocation rentalLocation = new RentalLocation();
      rentalLocation.setId(resultSet.getLong("ID"));
      rentalLocation.setName(resultSet.getString("NAME"));
      rentalLocation.setAddress1(resultSet.getString("ADDRESS1"));
      rentalLocation.setAddress2(resultSet.getString("ADDRESS2"));
      rentalLocation.setCity(resultSet.getString("CITY"));
      rentalLocation.setState(resultSet.getString("STATE"));
      rentalLocation.setZipCode(resultSet.getString("ZIP_CODE"));

      return rentalLocation;
    }
  }
}
