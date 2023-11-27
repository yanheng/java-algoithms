package com.think.in.java.chapter07.example04.demo02;

public class CADSystem extends Shape {

  private Circle c;
  private Triangle t;
  private Line[] lines = new Line[3];

  CADSystem(int i) {
    super(i + 1);
    for (int i1 = 0; i1 < lines.length; i1++) {
      lines[i1] = new Line(i1, i1 * i1);
    }

    c = new Circle(1);
    t = new Triangle(1);
    System.out.println("Combined constructor");
  }

  @Override
  void dispose() {
    System.out.println("CADSystem.dispose");
    t.dispose();
    c.dispose();
    super.dispose();
  }

  public static void main(String[] args) {
    CADSystem x = new CADSystem(47);
    try {

    } finally {
      x.dispose();
    }
  }
}
