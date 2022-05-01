package com.practice.behaviorial.iterator.Iterators;

import com.practice.behaviorial.iterator.IterableCollections.IntArray;

public class IntIterator implements Iterator {
  private int index = 0;

  private IntArray intArray;

  public IntIterator(IntArray intArray) {
    this.index = 0;
    this.intArray = intArray;
  }

  @Override
  public boolean hasNext() {
    if (index < intArray.elements.size())
      return true;
    else
      return false;
  }

  @Override
  public Object getNext() {
    return intArray.elements.get(index++);
  }

}
