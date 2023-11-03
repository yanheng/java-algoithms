package com.bugai.algoithms;


public class LinkList<E>  {

  private Node first;

  private Node last;

  private Integer size = 0;

  private static class Node<E> {
    Node<E> prev;
    E item;
    Node<E> next;

    public Node(Node<E> prev, E item, Node<E> next) {
      this.prev = prev;
      this.item = item;
      this.next = next;
    }
  }

  public void addFirst(E e) {
    final Node<E> f = first;
    final Node<E> newNode = new Node<E>(null, e, f);
    first = newNode;

    if (f == null) {
      last = newNode;
    } else {
      f.prev = newNode;
    }
    size++;
  }

  public void addLast(E e) {
    final Node<E> l = last;
    final Node<E> newNode = new Node<>(l, e, null);
    last = newNode;

    if (l == null) {
      last = newNode;
    } else {
      l.next = newNode;
    }
    size++;
  }


  public E unlink(Node<E> x) {
    final E element = x.item;
    final Node<E> next = x.next;
    final Node<E> prev = x.prev;

    // x为头节点
    if (prev == null) {
      first = next;
    } else {
      prev.next = next;
      x.prev = null;
    }

    // x为尾节点
    if (next == null) {
      last = prev;
    } else {
      next.prev = prev;
      x.next = null;
    }
    x.item = null;
    size--;
    return element;
  }

  public boolean remove(Object o) {
    if (o == null) {
      for (Node<E> x = first; x != null; x = x.next) {
        if (x.item == null) {
          unlink(x);
          return true;
        }
      }
    } else {
      for (Node<E> x = first; x != null; x = x.next) {
        if (o.equals(x.item)) {
          unlink(x);
          return true;
        }
      }
    }
    return false;
  }

  public void printLinkList() {
    for (Node x = first; x != null; x = x.next) {
      System.out.print(x.item + " -- ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    LinkList<String> list = new LinkList<>();
    // 添加元素
    list.addFirst("a");
    list.addFirst("b");
    list.addLast("c");
    // 打印列表
    list.printLinkList();
    // 头插元素
    list.addFirst("d");
    // 删除元素
    list.remove("b");
    // 打印列表
    list.printLinkList();
  }


}
