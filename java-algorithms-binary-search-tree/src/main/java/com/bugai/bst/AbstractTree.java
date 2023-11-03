package com.bugai.bst;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTree {
  public List<Integer> elementList = new ArrayList<>();

  public Node root;

  protected Node rotateLeft(Node node) {
    // 选中调整操作节点
    Node temp = node.right;
    // 修改操作节点的父节点
    temp.parent = node.parent;
    // 操作节点左孩子，挂载连接到node 右孩子上。如果右孩子有值，设置右孩子的父节点
    node.right = temp.left;
    if (node.right != null) {
      node.right.parent = node;
    }

    temp.left = node;
    node.parent = temp;
    if (temp.parent == null) {
      root = temp;
    } else {
      if (temp.parent.left == node) {
        temp.parent.left = temp;
      } else {
        temp.parent.right = temp;
      }
    }
    return temp;
  }

  protected Node rotateRight(Node node) {
    Node temp = node.left;
    temp.parent = node.parent;
    node.left = temp.right;
    if (node.left != null) {
      node.left.parent = node;
    }
    temp.right = node;
    node.parent = temp;

    if (temp.parent == null) {
      root = temp;
    } else {
      if (temp.parent.left == node) {
        temp.parent.left = temp;
      } else {
        temp.parent.right = temp;
      }
    }
    return temp;
  }

  protected String printSubTree(Node node) {
    StringBuilder tree = new StringBuilder();
    if (node.right != null) {
      printTree(node.right, true, "", tree);
    }
    printNodeValue(node, tree);
    if (node.left != null) {
      printTree(node.left, false, "", tree);
    }
    return tree.toString();
  }

  private void printTree(Node node, boolean isRight, String indent, StringBuilder tree) {
    if (node.right != null) {
      printTree(node.right, true, indent + (isRight ? "        " : " |      "), tree);
    }
    tree.append(indent);
    if (isRight) {
      tree.append(" /");
    } else {
      tree.append(" \\");
    }
    tree.append("----- ");
    printNodeValue(node, tree);
    if (node.left != null) {
      printTree(node.left, false, indent + (isRight ? " |      " : "        "), tree);
    }
  }

  private void printNodeValue(Node node, StringBuilder tree) {
    if (null == node.value) {
      tree.append("<NIL>");
    } else {
      tree.append(node.value);
      if (root.clazz.equals(AVLTree.class)) {
        tree.append("(").append(node.height).append(")");
      } else if (root.clazz.equals(RedBlackTree.class)) {
        tree.append("(").append(node.color == Node.Color.BLACK ? "黑" : "红").append(")");
      }
    }
    tree.append("\r\n");
  }


}
