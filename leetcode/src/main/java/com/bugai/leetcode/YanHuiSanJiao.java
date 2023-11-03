package com.bugai.leetcode;

import java.util.Vector;

/**
 * Given numRows, generate the first numRows of Pascal’s triangle.
 * <p>
 * For example, given numRows = 5,
 * Return
 * <p>
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */
public class YanHuiSanJiao {

  public int[][] generate(int numRows) {

    int[][] a = new int[numRows][];
    // 初始化每行数据组的大小
    for (int i = 0; i < numRows; i++) {
      a[i] = new int[i + 1];
    }
    for (int i = 0; i < numRows; i++) {
      a[i][0] = a[i][i] = 1;
      for (int j = 1; j < i; j++) {
        a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
      }
    }
    return a;
  }

  /**
   * 使用一维数组实现杨辉三角第N行号的值
   *
   * @param numRows
   * @return
   */
  public int[] generate1(int numRows) {
    int[] a = new int[numRows + 1];

    // 初始化数组
    for (int i = 0; i < numRows + 1; i++) {
      a[i] = 1;
    }

    // 行数
    for (int i = 0; i < numRows + 1; i++) {
      // 列值从 i>1 j>=1 开始使用与此公式
      for (int j = i - 1; j >= 1; j--) {
        a[j] = a[j] + a[j - 1];
      }
    }

    for (int i = 0; i < numRows + 1; i++) {
      System.out.print(a[i] + ",");
    }
    return a;

  }

  public static void main(String[] args) {
    YanHuiSanJiao yanHuiSanJiao = new YanHuiSanJiao();
    //    int[][] generate = yanHuiSanJiao.generate(5);
    //    for (int i = 0; i < generate.length; i++) {
    //      for (int i1 = 0; i1 < i + 1; i1++) {
    //        System.out.print(generate[i][i1] + ",");
    //      }
    //      System.out.println();
    //
    //    }

    yanHuiSanJiao.generate1(5);
  }
}
