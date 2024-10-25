package com.think.in.java.chapter11.demo03;

public class StackTest {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    //    for (String s : "My dog has fleas".split(" ")) {
    //      stack.push(s);
    //    }
    //
    //    while (!stack.empty()){
    //      System.out.println(stack.pop());
    //    }

    String str = "+U+n+c---+e+r+t---+a+i-+n+t+y---+-+r+u--+l+e+s---";
    char[] chars = str.toCharArray();
    boolean isPush = false;
    for (char aChar : chars) {
      if (aChar == '+') {
        isPush = true;
        continue;
      } else if (aChar == '-') {
        isPush = false;
        System.out.print(stack.pop());
        continue;
      }
      if (isPush) {
        stack.push(String.valueOf(aChar));
      }
    }
    System.out.println();

    System.out.println(stack);

  }
}
