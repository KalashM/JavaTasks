package com.example.matrix;

public class Demo {

    public static void main(String[] args) {

        int[][] array = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        //int[][] array = {{-1,3},{0,1},{2,-2}};
        Matrix matrix = new Matrix(array);
        int[][] array1 = {{10,20,30},{40,50,60},{70,80,90}};
        Matrix matrixToAdd = new Matrix(array1);
        int[][] array2 = {{1,1,1},{2,2,2},{3,3,3}};
        Matrix matrixToMultiply = new Matrix(array2);

        matrix.print();

        /*matrix.multiply(10);
        matrix.print();*/
        matrix.transpose();
        matrix.print();

       /* matrix.add(matrixToAdd);
        matrix.print();

        matrix.multiply(matrixToMultiply);
        matrix.print();*/
    }
}
