package com.think.in.java.chapter20.demo04;

import com.bugai.annotation.BuildProperty;


public class User {
  private String name;
  private int age;
  private String birthday;

  public String getName() {
    return name;
  }

  @BuildProperty
  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public static void main(String[] args) {
//    UserBuilder userBuilder = new UserBuilder();
//    User user = userBuilder.setName("zhangsan").build();
//    System.out.println(user.getName());
  }

}
