package com.think.in.java.chapter17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionMethod {

  public static void main(String[] args) {
    Countries countries = new Countries();
    Collection<String> c = new ArrayList<>();
    c.addAll(countries.names(5));

    c.add("ten");
    c.add("eleven");
    System.out.println(c);

    Object[] objects = c.toArray();
    System.out.println(objects.length);
    String[] strings = c.toArray(new String[0]);
    System.out.println(strings.length);

    System.out.println("Collections.max(x) = " + Collections.max(c));
    System.out.println("Collections.min(x) = " + Collections.min(c));

    Collection<String> c2 = new ArrayList<>();
    c2.addAll(countries.names(6));
    c.addAll(c2);
    System.out.println(c);

    c.remove(Countries.DATA[0][0]);
    System.out.println(c);
    c.remove(Countries.DATA[1][0]);
    System.out.println(c);

    c.removeAll(c2);
    System.out.println(c);

    String val = Countries.DATA[3][0];
    System.out.println("c.contains(" + val + ") = " + c.contains(val));
    Collection<String> c3 = ((List<String>) c).subList(3, 5);
    c2.retainAll(c3);
    System.out.println(c2);

  }
}
