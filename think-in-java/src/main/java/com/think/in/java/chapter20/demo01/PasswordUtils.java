package com.think.in.java.chapter20.demo01;

import java.util.List;

public class PasswordUtils {

  @UseCase(id = 47, description = "Password must contain at least one numeric")
  public boolean validatePassword(String password) {
    return (password.matches("\\w*\\d\\w*"));
  }

  @UseCase(id = 48)
  public String encryptPassword(String password) {
    return new StringBuilder(password).reverse().toString();
  }

  @UseCase(id = 49, description = "New password can't equal previously used ones.")
  public boolean checkForNewPassword(List<String> prePasswords, String password) {
    return !prePasswords.contains(password);
  }
}
