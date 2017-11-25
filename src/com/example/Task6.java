package com.example;

public class Task6 {

    public static int[] arrayOfFibonachi( int n) {
        int[] arrayFibonachi = new int[n];
        arrayFibonachi[0]=1;
        arrayFibonachi[1]=1;

        for (int i=2; i<n; i++) {
            arrayFibonachi[i] = arrayFibonachi[i-2] + arrayFibonachi[i-1]  ;
        }
/*        for (int k=0; k<n; k++) {
            System.out.println(arrayFibonachi[k]);
        }*/
        return arrayFibonachi;
    }
}
