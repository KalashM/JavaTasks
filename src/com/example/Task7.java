package com.example;

import java.util.ArrayList;

public class Task7 {
    public static void main(String[] args) {
        int[] arrRes = new int[100];



        for (int j = 0; j < arrRes.length; j++) {
            arrRes[j] = 0;
            //for (int i = j+1; arrRes[j] == 0 ; i++) {
            int i;
            for (i = j + 1;  ; i++) {
                while (arrRes[j] == 0) {

                    if (Task3.checkToSimple(i)) {
                        arrRes[j] = i;
                    } else {
                        arrRes[j] = 0;
                    }
                    break;
                }
                break;
            }
            System.out.println(arrRes[j]);
        }
    }
    /*public static ArrayList getListOfSimpleNumbers (int len) {


    }*/
}
