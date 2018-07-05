package com.prometheus.task3;

/**
 * Created by kalashnyk on 07/05/2018.
 */
public class Node{
    public Node next;
    public Integer data;

    public Node() {
    }

    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Integer getData() {
        return data;
    }
    public void setData(Integer data) {
        this.data = data;
    }
}
