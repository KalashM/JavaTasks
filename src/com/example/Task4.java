package com.example;

public class Task4 {

    public static int SumOfFactSequence (int n) {
        int res = 1;
        for (int i=2; i<=n; i++) {
            int fact=1;
            for (int j=2; j<=i; j++) {
                System.out.println(j);
                fact = fact * j;
            }
            if (i%2 ==0) {
                res = res - fact;
            } else {
                res = res + fact;
            }
        }

        return res;
    }
}
