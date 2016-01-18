package com.jvosantos.examples.data.repositories;

import com.jvosantos.examples.data.entities.Media;
import com.jvosantos.examples.data.entities.RentalLocation;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RentalLocationResultExtractor implements ResultSetExtractor<List<RentalLocation>> {
  @Override
  public List<RentalLocation> extractData(ResultSet resultSet)
      throws SQLException, DataAccessException {
    Map<Long, RentalLocation> rentalLocations = new HashMap<>();

    RentalLocation rentalLocation;

    while(resultSet.next()) {
      Long id = resultSet.getLong("ID");
      rentalLocation = rentalLocations.get(id);

      if(rentalLocation == null) {
        rentalLocation = new RentalLocation();
        rentalLocation.setId(resultSet.getLong("ID"));
        rentalLocation.setName(resultSet.getString("NAME"));
        rentalLocation.setAddress1(resultSet.getString("ADDRESS1"));
        rentalLocation.setAddress2(resultSet.getString("ADDRESS2"));
        rentalLocation.setCity(resultSet.getString("CITY"));
        rentalLocation.setState(resultSet.getString("STATE"));
        rentalLocation.setZipCode(resultSet.getString("ZIP_CODE"));
      }

      // must use index and not ID since there are two columns named ID
      Long mediaId = resultSet.getLong(8);

      if(mediaId > 0) {
        Media media = new Media();
        media.setId(resultSet.getLong("ID"));
        media.setTitle(resultSet.getString("TITLE"));
        media.setLength(resultSet.getLong("LENGTH"));
        media.setRating(resultSet.getLong("RATING"));
        media.setFormat(resultSet.getString("FORMAT"));
        media.setAvailable(resultSet.getBoolean("AVAILABLE"));
        media.setRentalLocation(rentalLocation);
        rentalLocation.getMedias().add(media);
      }

      rentalLocations.put(id, rentalLocation);
    }

    return new ArrayList<RentalLocation>(rentalLocations.values());
  }
}
