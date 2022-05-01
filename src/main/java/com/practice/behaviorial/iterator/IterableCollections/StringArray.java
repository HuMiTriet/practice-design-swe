package com.practice.behaviorial.iterator.IterableCollections;

import java.util.ArrayList;

import com.practice.behaviorial.iterator.Iterators.Iterator;
import com.practice.behaviorial.iterator.Iterators.StringIterator;

public class StringArray implements IterableCollection {
  public ArrayList<String> elements = new ArrayList<>();

  @Override
  public Iterator createIterator() {
    return new StringIterator(this);
  }

  public void addString(String string) {
    elements.add(string);
  }

}
