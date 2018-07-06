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

    public Integer get(int index) throws NullPointerException {
       if (index < 0 ) {
           return null;
       }
        int  i=0;
        Node n = head;

        while (i <= index && n != null) {
           if (i == index) {
               return n.getData();
           } else {
               if (n.getNext() != null ) {
                   n = n.getNext();
                   i++;
               } else return null;
           }
        }
        return null;
    }

    public boolean delete(int index) {
        if (index < 0 ) {
            return false;
        }
        Node n = head;
        Node prev = n;

        if (head == tail) {
            tail = null;
            head = null;
            return true;
        }
        for (int i=0; i<=index && n!=null; i++) {
           if (i == index) {
                if (n == tail) {
                    prev.setNext(null);
                }
                else if (n == head) {
                    head = n.getNext();
                }
                else {
                    prev.setNext(n.getNext());
                    return true;
                }

            } else {
                prev = n;
                n = n.getNext();
            }

        }
        return false;
    }

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
