package com.example;

public class Demo {
  //hello Maryna
  public static void main(String[] args) {

      String maxDiv = Task1.maxCommonDivisor(36,9);
      String sum = Task2.sumOfDigits(98765);
      String simpleCheck = Task3.checkToSimple(98765);
      int sumFact = Task4.sumOfFactSequence(8);
      int luckyNum = Task5.numberOfLuckyNumbers();


      System.out.println(maxDiv);
      System.out.println(sum);
      System.out.println(simpleCheck);
      System.out.println(sumFact);
      System.out.println(luckyNum);
  }

}
