package com.example;

public class Task10 {
    public static int [][] getTriangleMatrix (int size){

        //initialize triangle matrix:
        int[][] triangleMatrix = new int[size+1][];
        for (int i=0; i<=size; i++){
            triangleMatrix[i]= new int[i];
        }

        //fill the matrix with Pascal Triangle data:
        for (int i=0; i<=size; i++) {
            for (int j=0; j<i; j++) {
                triangleMatrix[i][0] = 1;
                if (i == j+1) {
                    triangleMatrix[i][j] = 1;
                } else if (i>=2 && j>0) {
                    triangleMatrix[i][j] = triangleMatrix[i-1][j-1] + triangleMatrix[i-1][j];
                }
            }
        }
    return triangleMatrix;
    }

}
