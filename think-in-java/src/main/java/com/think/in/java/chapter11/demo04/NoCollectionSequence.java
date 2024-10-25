package com.think.in.java.chapter11.demo04;


import java.util.Iterator;

class PetSequence {
  protected Pet[] pets = Pets.createArray(8);
}

public class NoCollectionSequence extends PetSequence {

  public Iterator<Pet> iterator() {
    return new Iterator<Pet>() {

      private int index;

      @Override
      public boolean hasNext() {
        return index < pets.length;
      }

      @Override
      public Pet next() {
        return pets[index++];
      }
    };
  }

  public static void main(String[] args) {
    NoCollectionSequence nc = new NoCollectionSequence();
    InterfaceVsIterator.display(nc.iterator());
  }

}
