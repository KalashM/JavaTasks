package com.example;

public class Task2 {
    public static String SumOfDigits (int x) {
        int sum = x%10;
        int div = (int) x/10;
        do {
           sum = sum + div%10;
           div = (int) div/10;
        } while (div > 0);

        String res = "Sum of digits (" + x + ") = " + sum;
        return res;
    }
}
