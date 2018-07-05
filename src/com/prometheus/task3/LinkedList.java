package com.prometheus.task3;

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
       if (index < 0 ) {
           return null;
       }
       int i=0;
        Node n = head;

        while (i <= index && n != null) {
           if (i == index) {
               return n.getData();
           } else {
               n = n.getNext();
               i++;
           }
        }
        return null;
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
