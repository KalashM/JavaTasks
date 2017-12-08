package com.example;

public class Task3 {

    public static boolean isSimple(int a) {

        int col = 0;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                col++;
            }
        }

        return col == 0;
    }

}
