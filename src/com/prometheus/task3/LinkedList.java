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
        //a.data = data;
        a.setData(data);
        if (tail == null) {
            head = a;
            tail = a;
        } else {
            //tail.next = a;
            tail.setNext(a);
            tail = a;
        }
    }

    public Integer get(int index)  {
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
        int i;

        if (head == tail) {
            tail = null;
            head = null;
            return true;
        }
        for (i=0; i<=index && n!=null; i++) {
        //while (n!=null) {
           if (i == index) {
                if (n == tail) {
                    prev.setNext(null);
                    return true;
                }
                else if (n == head) {
                    head = n.getNext();
                    return true;
                }
                else {
                    prev.setNext(n.getNext());
                    return true;
                }

            } else {
                prev = n;
                n = n.getNext();
              // i++;
            }
        }
        return false;
    }

    public int size() {
        int k=0;
        Node n = head;
        if (head == null) return 0;
        if (head == tail) {
            return 1;
        } else {
            while (n!= null) {
                k++;
                n=n.getNext();
            }
            return k;
        }

    }

    public void printList () {
        Node t = head;
        while (t!= null) {
            System.out.print(t.getData() + " ");
            t = t.getNext();
        }
    }
}
