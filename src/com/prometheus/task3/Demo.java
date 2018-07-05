package com.prometheus.task3;

public class Demo {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(5);
        l1.add(10);
        l1.add(1);

        l1.printList();
        System.out.println();
        int k = l1.get(2);
        System.out.println(k);

    }
}