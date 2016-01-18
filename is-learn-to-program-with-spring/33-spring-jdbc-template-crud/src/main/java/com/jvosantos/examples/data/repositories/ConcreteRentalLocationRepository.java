package com.jvosantos.examples.data.repositories;

import com.jvosantos.examples.data.entities.RentalLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

@Repository
public class ConcreteRentalLocationRepository implements RentalLocationRepository {

  private JdbcTemplate jdbcTemplate;

  private static final String RENTAL_LOCATION_TABLE = "RENTAL_LOCATION";

  private static final String RENTAL_LOCATION_COLUMNS =
      "ID, NAME, ADDRESS1, ADDRESS2, CITY, STATE, ZIP_CODE";

  private static final String INSERT_STATEMENT =
      "insert into " + RENTAL_LOCATION_TABLE + " (" + RENTAL_LOCATION_COLUMNS + ") "
          + "values (null, ?, ?, ?, ?, ?, ?)";

  private static final String UPDATE_STATEMENT =
      "update " + RENTAL_LOCATION_TABLE
          + " set NAME = ?, ADDRESS1 = ?, ADDRESS2 = ?, CITY = ?, STATE = ?, ZIP_CODE = ?"
          + " where ID = ?";

  private static final String DELETE_STATEMENT =
      "delete from " + RENTAL_LOCATION_TABLE + " where ID = ?";

  @Autowired
  public ConcreteRentalLocationRepository(DataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }

  @Override
  public void insert(RentalLocation rentalLocation) {
    KeyHolder keyHolder = new GeneratedKeyHolder();

    jdbcTemplate.update(new PreparedStatementCreator() {
      @Override
      public PreparedStatement createPreparedStatement(Connection connection)
          throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STATEMENT,
            Statement.RETURN_GENERATED_KEYS);

        preparedStatement.setString(1, rentalLocation.getName());
        preparedStatement.setString(2, rentalLocation.getAddress1());
        preparedStatement.setString(3, rentalLocation.getAddress2());
        preparedStatement.setString(4, rentalLocation.getCity());
        preparedStatement.setString(5, rentalLocation.getState());
        preparedStatement.setString(6, rentalLocation.getZipCode());

        return preparedStatement;
      }
    }, keyHolder);

    rentalLocation.setId(keyHolder.getKey().longValue());
  }

  @Override
  public void update(RentalLocation rentalLocation) {
    jdbcTemplate.update(UPDATE_STATEMENT, new Object[] {
        rentalLocation.getName(),
        rentalLocation.getAddress1(),
        rentalLocation.getAddress2(),
        rentalLocation.getCity(),
        rentalLocation.getState(),
        rentalLocation.getZipCode(),
        rentalLocation.getId()
    });
  }

  @Override
  public void delete(RentalLocation rentalLocation) {
    jdbcTemplate.update(DELETE_STATEMENT, new Object[] {rentalLocation.getId()});
  }

  @Override
  public RentalLocation findById(Long id) {
    return null;
  }

}
