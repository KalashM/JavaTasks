package com.example;

public class Task5 {
    public static int numberOfLuckyNumbers (){
        int res = 0;
        for (int i = 100000; i<=999999; i++) {
            int sum1 = i%10;
            int sum2 = 0;
            int div1 = (int) i/10;
            do {
                sum1 = sum1 + div1%10;
                div1 = (int) div1/10;
            } while (div1 > 999);
            do {
                sum2 = sum2 + div1%10;
                div1 = (int) div1/10;
            } while (div1 <= 0) ;
            if (sum1 == sum2) {
                 res++;
            }
        }

        return res;
    }

}
