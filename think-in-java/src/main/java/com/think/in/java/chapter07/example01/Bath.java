package com.think.in.java.chapter07.example01;

public class Bath {
  private String s1 = "Happy",
          s2 = "Happy",
          s3, s4;

  private Soap castille;

  private int i;

  private float toy;

  public Bath() {
    System.out.println("Inside  Batch");
    s3 = "Joy";
    toy = 3.14f;
    castille = new Soap();
  }

  {
    i = 47;
  }

  @Override
  public String toString() {
    if (s4 == null) {
      s4 = s3;
    }
    return "Bath{" +
            "s1='" + s1 + '\'' +
            ", s2='" + s2 + '\'' +
            ", s3='" + s3 + '\'' +
            ", s4='" + s4 + '\'' +
            ", castille=" + castille +
            ", i=" + i +
            ", toy=" + toy +
            '}';
  }

  public static void main(String[] args) {
    Bath b = new Bath();
    System.out.println(b);
  }
}
