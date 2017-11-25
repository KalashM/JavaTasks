package com.example;

public class Demo {
  //hello Maryna
  public static void main(String[] args) {

      int maxDiv = Task1.maxCommonDivisor(36,9);
      int sum = Task2.sumOfDigits(98765);
      boolean simpleCheck = Task3.checkToSimple(98765);
      int sumFact = Task4.sumOfFactSequence(8);
      int luckyNum = Task5.numberOfLuckyNumbers(100001,100100);
      int[] testFibonachi = Task6.arrayOfFibonachi(20);


      System.out.println("maxDiv = " + maxDiv);
      System.out.println("sum = " + sum);
      System.out.println("simpleCheck = " + simpleCheck);
      System.out.println("sumFact = " + sumFact);
      System.out.println("luckyNum = " + luckyNum);
      for (int i=0; i<testFibonachi.length; i++) {
          System.out.println(testFibonachi[i]);
      }
  }

}
