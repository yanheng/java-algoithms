package com.think.in.java.chapter11.demo04;

import java.util.Collection;
import java.util.Iterator;

public class CollectionSequence1 implements Collection<Pet> {
  private Pet[] pets = Pets.createArray(8);

  @Override
  public int size() {
    return pets.length;
  }

  @Override
  public boolean isEmpty() {
    return size() == 0;
  }

  @Override
  public boolean contains(Object o) {
    Iterator<Pet> iterator = iterator();
    if (o == null) {
      while (iterator.hasNext()) {
        if (iterator.next() == null) {
          return true;
        }
      }
    } else {
      while (iterator.hasNext()) {
        if (o.equals(iterator.next())) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Iterator<Pet> iterator() {
    return new Iterator<Pet>() {
      private int index = 0;

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

  @Override
  public Object[] toArray() {
    return new Object[0];
  }

  @Override
  public <T> T[] toArray(T[] a) {
    return null;
  }

  @Override
  public boolean add(Pet pet) {
    return false;
  }

  @Override
  public boolean remove(Object o) {
    return false;
  }

  @Override
  public boolean containsAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean addAll(Collection<? extends Pet> c) {
    return false;
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    return false;
  }

  @Override
  public void clear() {

  }
}
