package com.bugai.reflection.demo11;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MyClassLoader extends ClassLoader {


  public MyClassLoader(ClassLoader parent) {
    super(parent);
  }

  @Override
  public Class<?> loadClass(String name) throws ClassNotFoundException {
    if (!"reflection.MyObject".equals(name)) {
      return super.loadClass(name);
    }

    try {
      String url = "E:\\MyObject.class";
      URL myUrl = new URL(url);
      URLConnection urlConnection = myUrl.openConnection();
      InputStream inputStream = urlConnection.getInputStream();
      ByteArrayOutputStream buffer = new ByteArrayOutputStream();
      int data = inputStream.read();
      if (data != -1) {
        buffer.write(data);
        data = inputStream.read();
      }
      byte[] classData = buffer.toByteArray();
      return defineClass("reflection.MyObject", classData, 0, classData.length);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static void main(String[] args) {

  }
}
