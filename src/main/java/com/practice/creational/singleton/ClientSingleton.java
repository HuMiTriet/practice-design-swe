package com.practice.creational.singleton;

public class ClientSingleton {
  public static void execute() {
    Database database = Database.getInstance();

    database.querySQL();

    Database database2 = Database.getInstance();

    database2.querySQL();
  }
}
