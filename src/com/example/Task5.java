package com.example;

public class Task5 {

    /*public static void main(String[] args) {
        int num = numberOfLuckyNumbers(100000,100002);

    }*/

    public static int numberOfLuckyNumbers (int startRange, int endRange){
        int res = 0;
        int iRes;
        for (int i = startRange; i<=endRange; i++) {
        // int i = 100001;
            int sum1 = i%10;
            int sum2 = 0;
            int div1 = (int) i/10;
            do {
                sum1 = sum1 + div1%10;
                div1 = (int) div1/10;
            } while (div1 > 999);
       //System.out.println(div1 + " - div1");
       //System.out.println(sum1);
            do {
                sum2 = sum2 + div1%10;
                div1 = (int) div1/10;
            } while (div1 > 0) ;
        //System.out.println(sum2);
            if (sum1 == sum2) {
                System.out.println(i);
                res++;
            }
        }

        return res;
    }

}
