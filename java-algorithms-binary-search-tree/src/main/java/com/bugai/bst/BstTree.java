package com.bugai.bst;

public class BstTree {

  private Node root;
  private Integer size;

  public Node insert(Integer e) {
    if (root == null) {
      root = new Node(e, null, null, null);
      size++;
      return root;
    }
    Node parent = root;
    Node search = root;
    while (search != null && search.value != null) {
      parent = search;
      if (e < search.value) {
        search = search.left;
      } else {
        search = search.right;
      }
    }

    Node newNode = new Node(e, parent, null, null);
    if (parent.value > newNode.value) {
      parent.left = newNode;
    } else {
      parent.right = newNode;
    }
    size++;
    return newNode;
  }

  public Node search(int e) {
    Node node = root;
    while (node != null && node.value != null && node.value != e) {
      if (e < node.value) {
        node = node.left;
      } else {
        node = node.right;
      }
    }
    return node;
  }

  public Node delete(int e) {
    Node delNode = search(e);
    if (delNode == null) {
      return null;
    }
    return delNode(delNode);
  }

  private Node delNode(Node delNode) {
    if (delNode == null) {
      return null;
    }
    Node result = null;
    if (delNode.left == null) {
      result = transplant(delNode, delNode.right);
    } else if (delNode.right == null) {
      result = transplant(delNode, delNode.left);
    } else {
      Node miniNode = getMinimum(delNode.right);
      if (miniNode.parent != delNode) {
        transplant(miniNode, miniNode.right);
        miniNode.right = delNode.right;
        miniNode.right.parent = miniNode;
      }

      transplant(delNode, miniNode);
      miniNode.left = delNode.left;
      miniNode.left.parent = miniNode;
      result = miniNode;
    }
    size --;
    return result;
  }

  private Node getMinimum(Node node) {
    while (node.left != null) {
      node = node.left;
    }
    return node;
  }

  private Node transplant(Node delNode, Node addNode) {
    // 与根节点交换位置
    if (delNode.parent == null) {
      this.root = addNode;
    }
    // 判断是左/右子树
    else if (delNode.parent.left == delNode) {
      delNode.parent.left = addNode;
    } else {
      delNode.parent.right = addNode;
    }
    // 设置父节点
    if (null != addNode) {
      addNode.parent = delNode.parent;
    }
    return addNode;
  }


}
