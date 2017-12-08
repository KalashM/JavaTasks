package com.example;

public class Task2 {

    public static int sumOfDigits(int x) {
        int sum = x % 10;
        int div = x / 10;
        do {
            sum = sum + div % 10;
            div = div / 10;
        } while (div > 0);

        return sum;
    }
}
