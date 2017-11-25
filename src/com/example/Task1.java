package com.example;

public class Task1 {
    public static int maxCommonDivisor (int a , int b) {


        int max = 1;
        int minNum;
        if (a < b) {
            minNum = a;
        } else {
            minNum = b;
        }

       for (int i=1; i<=minNum; i++) {
            if (a%i == 0 && b%i == 0){
                max = i;
            }
        }

        return max;

    }
}
