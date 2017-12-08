package com.example.matrix;

public class Demo {

    public static void main(String[] args) {

        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        Matrix matrix = new Matrix(array);
        matrix.print();

        matrix.multiply(10);

        matrix.print();
    }
}
