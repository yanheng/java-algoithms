package com.bugai.leetcode;

public class PrintSquare {

  public static void printSquare() {
    int size = 5;
    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= size; j++) {
        if (i == 1 || i == size || j == 1 || j == size) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  /**
   * *
   * * *
   * *   *
   * *     *
   * * * * * *
   */
  public static void printRightTriangle() {
    int size = 10;
    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= size; j++) {
        // 每行的首列、每列的最后一行、行和列值相等的位置打印*
        if (j == 1 || i == size || j == i) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  /*
   *         *
   *       * *
   *     *   *
   *   *     *
   * * * * * *
   */
  public static void printRightTriangle1() {
    int size = 10;
    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= size; j++) {
        // 每行的最后列、每列的最后一行、行和列值相等的位置打印*
        if (j == size || i == size) {
          System.out.print("* ");
          continue;
        } else if ((size - i) == j && i != 1 && j != size) {
          System.out.print(" *");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }


  /**
   *
   */
  public static void printIsoscelesTriangle() {
    int height = 5; // 三角形的高度
    for (int i = 1; i <= height; i++) { // 控制行数
      for (int j = 1; j <= height - i; j++) { // 控制列数
        System.out.print("  "); // 打印空格
      }
      for (int k = 1; k <= 2 * i - 1; k++) { // 控制星号数量
        if (i == height || k == 1 || k == 2 * i - 1) {
          System.out.print("* "); // 打印星号
        } else {
          System.out.print("  "); // 打印空格
        }
      }
      System.out.println(); // 换行
    }
  }

  public static void main(String[] args) {

    PrintSquare.printIsoscelesTriangle();
  }
}
