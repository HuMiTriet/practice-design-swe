package com.practice.behaviorial.iterator.Iterators;

import com.practice.behaviorial.iterator.IterableCollections.StringArray;

public class StringIterator implements Iterator {
  private StringArray stringArray;

  int index = 0;

  public StringIterator(StringArray stringArray) {
    this.index = 0;
    this.stringArray = stringArray;
  }

  @Override
  public boolean hasNext() {
    if (index < stringArray.elements.size())
      return true;
    else
      return false;
  }

  @Override
  public Object getNext() {
    if (this.hasNext())
      return stringArray.elements.get(index++);
    else
      return null;
  }

}
