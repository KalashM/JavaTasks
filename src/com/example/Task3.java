package com.example;

public class Task3 {
    public static boolean checkToSimple(int a) {

        boolean res;
        int col = 0;

        for (int i=2; i<a; i++) {
            if (a%i == 0 ){
                col++;
            }
        }

        if (col == 0) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }
}
