package com.prometheus.task3;

public class Demo {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(5);
        l1.add(7);
        l1.add(8);
        l1.add(6);

        l1.printList();
        System.out.println();
        Integer k = l1.get(8);
        System.out.println(k);

        l1.delete(0);
        System.out.println();
        l1.printList();

    }
}