package com.think.in.java.chapter20.demo02;

public @interface Uniqueness {
  Constraints constraints() default @Constraints(unique = true);
}
