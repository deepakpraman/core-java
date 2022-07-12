package com.bigdreams.corejava.datastructures.linkedlist;

public class Node<T> {
    public T data;
    public Node nextNode;

    public Node(T data,Node nextNode) {
    this.nextNode=nextNode;
    this.data=data;
    }

    public Node() {
    }
}
