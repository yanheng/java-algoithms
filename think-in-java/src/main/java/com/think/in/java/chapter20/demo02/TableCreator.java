package com.think.in.java.chapter20.demo02;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TableCreator {

  private static final String URL = "jdbc:mysql://127.0.0.1:3306/mybot?useUnicode=true";
  private static final String USER_NAME = "root";
  private static final String PASSWORD = "root";

  private static String getConstraints(Constraints con) {
    String constraints = "";
    if (!con.allowNull()) {
      constraints += " NOT NULL";
    }
    if (con.primaryKey()) {
      constraints += " PRIMARY KEY";
    }
    if (con.unique()) {
      constraints += " UNIQUE";
    }
    return constraints;
  }

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    //    if (args.length < 1) {
    //      System.out.println("arguments: annotated classes");
    //      System.exit(0);
    //    }
    String name = Member.class.getName();
    String[] args1 = {name};

    for (String className : args1) {
      Class<?> aClass = Class.forName(className);
      DBTable dbTable = aClass.getAnnotation(DBTable.class);
      if (dbTable == null) {
        System.out.println("No DBTable annotation in class " + className);
        continue;
      }

      String tableName = dbTable.name();
      if (tableName.length() < 1) {
        tableName = aClass.getName().toUpperCase();
      }

      List<String> columDefs = new ArrayList<>();
      for (Field field : aClass.getDeclaredFields()) {
        String columName = null;
        Annotation[] annotations = field.getDeclaredAnnotations();
        if (annotations.length < 1) {
          continue;
        }
        if (annotations[0] instanceof SQLInteger) {
          SQLInteger sqlInteger = (SQLInteger) annotations[0];
          if (sqlInteger.name().length() < 1) {
            columName = field.getName().toUpperCase();
          } else {
            columName = sqlInteger.name();
          }
          columDefs.add(columName + " INT" + getConstraints(sqlInteger.constraints()));
        }

        if (annotations[0] instanceof SQLString) {
          SQLString sqlString = (SQLString) annotations[0];
          if (sqlString.name().length() < 1) {
            columName = field.getName().toUpperCase();
          } else {
            columName = sqlString.name();
          }
          columDefs.add(columName + " VARCHAR(" + sqlString.value() + ")" + getConstraints(sqlString.constraints()));
        }

        if (annotations[0] instanceof SQLDatetime) {
          SQLDatetime sqlDatetime = (SQLDatetime) annotations[0];
          if (sqlDatetime.name().length() < 1) {
            columName = field.getName().toUpperCase();
          } else {
            columName = sqlDatetime.name();
          }
          columDefs.add(columName + " DATETIME " + getConstraints(sqlDatetime.constraints()));
        }

      }

      StringBuilder createCommand = new StringBuilder(
              "CREATE TABLE " + tableName + "("
      );
      for (String columDef : columDefs) {
        createCommand.append("\n" + columDef + ",");
      }

      String tableCreate = createCommand.substring(0, createCommand.length() - 1) + ");";


      System.out.println("Table Creation SQL for className is :\n" + tableCreate);
      createTable(tableCreate);
    }
  }

  private static void createTable(String tableCreate) throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");

    Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

    Statement statement = connection.createStatement();
    statement.execute(tableCreate);
    statement.close();
    connection.close();
  }
}
