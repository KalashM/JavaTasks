package com.example;

import java.util.ArrayList;

public class Task7 {
    public static int[] getListOfSimpleNumbers(int len) {
        int[] arrRes = new int[len];
        for (int j = 0; j < len; j++) {
            arrRes[j] = 0;
            int i;
            for (i = j + 1;  ; i++) {
                if (Task3.isSimple(i)) {
                    arrRes[j] = i;
                } else {
                    arrRes[j] = 0;
                }
                break;
            }
        }
        return arrRes;
    }
}
