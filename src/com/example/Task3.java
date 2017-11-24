package com.example;

public class Task3 {
    public static String checkToSimple(int a) {

        String res;
        int col = 0;

        for (int i=2; i<a; i++) {
            if (a%i == 0 ){
                col++;
            }
        }

        if (col == 0) {
            res = a + " - simple number";
        } else {
            res = a + " - not simple number";
        }
        return res;
    }
}
