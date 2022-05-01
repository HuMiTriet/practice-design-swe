package com.practice.structural.facade;

public class ClientFacade {

  public static void execute() {
    String file = "hello.ogg";

    file = VideoConverter.extract(file, "mp4");

    System.out.println(file);
  }

}
