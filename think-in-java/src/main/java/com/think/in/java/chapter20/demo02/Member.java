package com.think.in.java.chapter20.demo02;

import java.util.Date;

@DBTable(name = "MEMBER")
public class Member {
  @SQLString(30)
  String firstName;

  @SQLString(50)
  String lastName;

  @SQLInteger
  Integer age;

  @SQLString(value = 30, constraints = @Constraints(primaryKey = true))
  String handle;

  @SQLDatetime
  Date birthday;

  static int memberCount;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  @Override
  public String toString() {
    return handle;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }
}
