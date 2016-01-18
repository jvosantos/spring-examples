package com.jvosantos.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Application {
  public static void main(String[] args) {
    Connection connection = null;

    PreparedStatement preparedStatement = null;

    try {
      connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "db_user", "password");
      String sql = "insert into rental_location values(?, ?, ?, ?, ?, ?, ?)";

      preparedStatement = connection.prepareStatement(sql);

      preparedStatement.setInt(1, 1);
      preparedStatement.setString(2, "Gas Station");
      preparedStatement.setString(3, "Address1");
      preparedStatement.setString(4, "Address2");
      preparedStatement.setString(5, "city");
      preparedStatement.setString(6, "state");
      preparedStatement.setString(7, "postal code");

      preparedStatement.execute();
    } catch (SQLException e) {
      System.out.println("Sh*t happens");
      e.printStackTrace();
    } finally {
      try {
        preparedStatement.close();
        connection.close();
      } catch (SQLException e) {
        System.out.println("Sh*t happens");
        e.printStackTrace();
      }
    }

  }
}
