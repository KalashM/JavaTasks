package com.example;

import java.util.Arrays;

public class Demo {

  public static void main(String[] args) {

      int maxDiv = Task1.maxCommonDivisor(36,9);
      int sum = Task2.sumOfDigits(98765);
      boolean simpleCheck = Task3.isSimple(98765);
      int sumFact = Task4.sumOfFactSequence(8);
      int luckyNum = Task5.numberOfLuckyNumbers(100001,100100);
      int[] testFibonachi = Task6.arrayOfFibonachi(20);
      int[] arrSimpleNums = Task7.getListOfSimpleNumbers(7);
      char[][] arrChess = Task8.chessArray(5,5);
      int[][][][][][] sixDimArr = Task9.sixDimensionalArray(2);

      System.out.println("maxDiv = " + maxDiv);
      System.out.println("sum = " + sum);
      System.out.println("simpleCheck = " + simpleCheck);
      System.out.println("sumFact = " + sumFact);
      System.out.println("luckyNum = " + luckyNum);
      for (int i=0; i<testFibonachi.length; i++) {
          System.out.println(testFibonachi[i]);
      }
      for (int i=0; i<arrSimpleNums.length; i++) {
          System.out.println(arrSimpleNums[i]);
      }
      //System.out.println(Arrays.deepToString(arrChess));

      //print array from task8
      for(int i = 0; i<arrChess.length; i++){
          for(int j = 0; j<arrChess[i].length; j++){
              System.out.print(arrChess[i][j] + " ");
          }
          System.out.println();
      }

      //print 6 dimensional array from task9
      System.out.println(Arrays.deepToString(sixDimArr));


  }

}
