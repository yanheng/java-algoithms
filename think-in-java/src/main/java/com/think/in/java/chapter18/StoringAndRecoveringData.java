package com.think.in.java.chapter18;

import java.io.*;

public class StoringAndRecoveringData {
  public static void main(String[] args) throws IOException {
    DataOutputStream out = new DataOutputStream(
            new BufferedOutputStream(new FileOutputStream("Data.txt"))
    );
    out.writeDouble(3.1415926);
    out.writeUTF("That was pi");
    out.writeDouble(1.4159);
    out.writeUTF("Square root of 2");
    out.close();

    DataInputStream in = new DataInputStream(new BufferedInputStream(
            new FileInputStream("Data.txt")
    ));
    System.out.println(in.readDouble());
    System.out.println(in.readUTF());
    System.out.println(in.readDouble());
    System.out.println(in.readUTF());
  }
}
