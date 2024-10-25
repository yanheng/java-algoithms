package com.think.in.java.chapter17;

import java.util.*;

public class Countries {
  public static final String[][] DATA = {
          {"ALGERIA", "Algeria"}, {"ANGOLA", "Luanda"}, {"BENIN", "Proto-Novo"},
          {"BOTSWANA", "Gaberone"}, {"BURKINA FASO", "Ouagadougou"}
  };

  private class FlyweightMap extends AbstractMap<String, String> {


    private class Entry implements Map.Entry<String, String> {
      int index;

      public Entry(int index) {
        this.index = index;
      }

      @Override
      public boolean equals(Object o) {
        return DATA[index][0].equals(o);
      }

      @Override
      public int hashCode() {
        return DATA[index][0].hashCode();
      }

      @Override
      public String getKey() {
        return DATA[index][0];
      }

      @Override
      public String getValue() {
        return DATA[index][1];
      }

      @Override
      public String setValue(String value) {
        throw new UnsupportedOperationException();
      }
    }

    class EntrySet extends AbstractSet<Map.Entry<String, String>> {

      private int size;

      EntrySet(int size) {
        if (size < 0) {
          this.size = 0;
        } else if (size > DATA.length) {
          this.size = DATA.length;
        } else {
          this.size = size;
        }
      }

      private class Iter implements Iterator<Map.Entry<String, String>> {

        private Entry entry = new Entry(-1);

        @Override
        public boolean hasNext() {
          return entry.index < size - 1;
        }

        @Override
        public Map.Entry<String, String> next() {
          entry.index++;
          return entry;
        }
      }

      @Override
      public Iterator<Map.Entry<String, String>> iterator() {
        return new Iter();
      }

      @Override
      public int size() {
        return size;
      }
    }

    private Set<Map.Entry<String, String>> entries = new EntrySet(DATA.length);

    @Override
    public Set<Map.Entry<String, String>> entrySet() {
      return entries;
    }
  }

  Map<String, String> select(final int size) {
    return new FlyweightMap() {
      public Set<Map.Entry<String, String>> entrySet() {
        return new EntrySet(size);
      }
    };
  }

  Map<String, String> map = new FlyweightMap();

  public Map<String, String> capitals() {
    return map;
  }

  public Map<String, String> capitals(int size) {
    return select(size);
  }

  List<String> names = new ArrayList<>(map.keySet());

  List<String> names() {
    return names;
  }

  public List<String> names(int size) {
    return new ArrayList<>(select(size).keySet());
  }

  public static void main(String[] args) {
    Countries countries = new Countries();
    System.out.println(countries.capitals(3));
    System.out.println(countries.names());
    System.out.println(new HashMap<>(countries.capitals(3)));
    System.out.println(new LinkedHashMap<>(countries.capitals(3)));
    System.out.println(new TreeMap<>(countries.capitals(3)));
    System.out.println(new Hashtable<>(countries.capitals(3)));
    System.out.println(new HashSet<>(countries.names(5)));
    System.out.println(new LinkedHashSet<>(countries.names(5)));
    System.out.println(new TreeSet<>(countries.names(5)));
    System.out.println(new ArrayList<>(countries.names(5)));
    System.out.println(new LinkedList<>(countries.names(5)));
    System.out.println(countries.capitals().get("ANGOLA"));
  }
}
