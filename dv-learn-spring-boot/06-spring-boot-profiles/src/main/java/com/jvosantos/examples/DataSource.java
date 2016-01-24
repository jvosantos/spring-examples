package com.jvosantos.examples;

public class DataSource {
  private String server;
  private int port;

  public DataSource() {
  }

  public DataSource(String server, int port) {
    this.server = server;
    this.port = port;
  }

  @Override
  public String toString() {
    return "DataSource{" +
        "server='" + server + '\'' +
        ", port=" + port +
        '}';
  }
}
