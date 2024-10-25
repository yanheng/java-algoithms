package com.think.in.java.chapter11.demo04;

import java.util.AbstractCollection;
import java.util.Iterator;

public class CollectionSequence extends AbstractCollection {

  private Pet[] pets = Pets.createArray(8);


  @Override
  public Iterator iterator() {
    return new Iterator() {
      private int index = 0;

      @Override
      public boolean hasNext() {
        return index < pets.length;
      }

      @Override
      public Object next() {
        return pets[index++];
      }
    };
  }

  @Override
  public int size() {
    return pets.length;
  }

  public static void main(String[] args) {
    CollectionSequence c = new CollectionSequence();
    InterfaceVsIterator.display(c);
    InterfaceVsIterator.display(c.iterator());
  }
}
