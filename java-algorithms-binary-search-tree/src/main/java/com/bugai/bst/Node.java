package com.bugai.bst;

import java.util.Objects;

public class Node {

  public Node(Integer value, Node parent, Node left, Node right) {
    this.value = value;
    this.parent = parent;
    this.left = left;
    this.right = right;
  }

  public Node() {
  }

  public Class<?> clazz;

  public Integer value;
  public Node parent;
  public Node left;
  public Node right;


  // AVL 树所需属性
  public int height;
  // 红黑树所需属性
  public Color color = Color.RED;

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (null == obj)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Node node = (Node) obj;
    if (null == value) {
      return node.value == null;
    } else {
      return node.value.equals(value);
    }
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((value == null) ? 0 : value.hashCode());
    return result;
  }

  // 红黑树枚举
  enum Color {
    RED, BLACK
  }
}
