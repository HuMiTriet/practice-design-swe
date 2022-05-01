package com.practice.behaviorial.iterator.IterableCollections;

import java.util.ArrayList;

import com.practice.behaviorial.iterator.Iterators.IntIterator;
import com.practice.behaviorial.iterator.Iterators.Iterator;

public class IntArray implements IterableCollection {

  public ArrayList<Integer> elements = new ArrayList<>();

  @Override
  public Iterator createIterator() {
    return new IntIterator(this);
  }

  public void addInt(int num) {
    this.elements.add(num);
  }

}
