package com.practice.creational.singleton;

public class Database {
  private static Database instance = new Database();

  private Database() {
    System.out.println("CONNECTED TO DATBASE");
  };

  // the getter method must be static or object can't be retrieved
  public static Database getInstance() {
    return instance;
  }

  public void querySQL() {
    System.out.println("Querying SQL queries");
  }

}
