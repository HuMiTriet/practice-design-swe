package com.practice.creational.factory;

import com.practice.creational.factory.creator.Dialog;
import com.practice.creational.factory.creator.WebDialog;
import com.practice.creational.factory.creator.WindowsDialog;

public class ClientFactory {
  public static void execute() {

    Dialog dialog = new WindowsDialog();

    // The client doesn't have to know that they have to create a Window Button
    // to run the render method
    dialog.render();

    System.out.println("--------------------------------------------------------------------------------");

    dialog = new WebDialog();

    dialog.render();
  }
}
