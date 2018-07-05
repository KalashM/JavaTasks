package com.prometheus.task3;

/**
 * Created by kalashnyk on 07/05/2018.
 */
import com.prometheus.task3.Node;

public class LinkedList {
    private Node tail;
    private Node head;

    public LinkedList() {
        //PUT YOUR CODE HERE
        //PUT YOUR CODE HERE
    }

    public void add(Integer data) {
        Node a = new Node();
        a.data = data;
        if (tail == null) {
            head = a;
            tail = a;
        } else {
            tail.next = a;
            tail = a;
        }
    }

    public Integer get(int index) {
        if (head == null || tail == head) {
            return null;
        } else {
            for (int i=0; i<=index; i++) {

            }
        }

    }

   /* public boolean delete(int index) {
        //PUT YOUR CODE HERE
        //PUT YOUR CODE HERE
    }*/

    /*public int size() {
        //PUT YOUR CODE HERE
        //PUT YOUR CODE HERE
    }*/

    public void printList () {
        Node t = head;
        while (t!= null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }
}
