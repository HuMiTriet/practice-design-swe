package com.practice.behaviorial.iterator;

import com.practice.behaviorial.iterator.IterableCollections.IntArray;
import com.practice.behaviorial.iterator.IterableCollections.StringArray;
import com.practice.behaviorial.iterator.Iterators.Iterator;

public class ClientIterator {

  public static void execute() {
    StringArray stringArray = new StringArray();

    stringArray.addString("HELLO");
    stringArray.addString("WORLD");
    stringArray.addString("ME");

    Iterator itr = stringArray.createIterator();

    while (itr.hasNext()) {
      System.out.println(itr.getNext());
    }

    System.out.println("--------------------------------------------------------------------------------");

    IntArray intArray = new IntArray();

    intArray.addInt(1);
    intArray.addInt(2);
    intArray.addInt(3);
    intArray.addInt(4);

    Iterator itrInt = intArray.createIterator();

    while (itrInt.hasNext()) {
      System.out.println(itrInt.getNext());
    }

  }

}
