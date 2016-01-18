package com.jvosantos.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Application {
  public static void main(String[] args) {
    ApplicationContext applicationContext =
        new ClassPathXmlApplicationContext("application-context.xml");

    System.out.println("Retrieving datasource from spring..");
    DataSource dataSource = applicationContext.getBean("dataSource", DataSource.class);

    Connection connection = null;

    PreparedStatement preparedStatement = null;

    try {
      System.out.println("Getting a connection from datasource..");
      connection = dataSource.getConnection();
      String sql = "insert into rental_location values(?, ?, ?, ?, ?, ?, ?)";

      System.out.println("Preparing statement: " + sql);
      preparedStatement = connection.prepareStatement(sql);

      preparedStatement.setInt(1, 1);
      preparedStatement.setString(2, "Gas Station");
      preparedStatement.setString(3, "Address1");
      preparedStatement.setString(4, "Address2");
      preparedStatement.setString(5, "city");
      preparedStatement.setString(6, "state");
      preparedStatement.setString(7, "postal code");

      System.out.println("Executing statement..");

      preparedStatement.execute();
    } catch (SQLException e) {
      System.out.println("Sh*t happens");
      e.printStackTrace();
    } finally {
      try {
        System.out.println("Closing statement and connection..");
        preparedStatement.close();
        connection.close();
      } catch (SQLException e) {
        System.out.println("Sh*t happens");
        e.printStackTrace();
      }
    }


  }
}
