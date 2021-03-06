package com.example.matrix;

public class Matrix {

    private int rows;
    private int columns;

    private int[][] matrix;

    /**
     * initialize empty matrix (all values equal zero)
     * @param rows
     * @param columns
     */
    public Matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        matrix = new int[rows][columns];
    }

    /**
     * Initialize matrix from array
     * @param matrix
     */
    public Matrix(int[][] matrix){
        this.rows = matrix.length;
        this.columns = matrix[0].length;
        this.matrix = matrix;
    }

    /**
     * Transpose current matrix
     */
    public void transpose(){
        int [][] matrixToTranspose = new int[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                matrixToTranspose[i][j] = matrix[j][i];
            }
        }
        matrix = matrixToTranspose;
        this.rows = matrix.length;
        this.columns = matrix[0].length;
    }

    /**
     * Add matrix to current matrix
     * @param matrix
     */
    public void add(Matrix matrix){
        if (matrix.columns == this.columns && matrix.rows == this.rows) {
            for (int i=0; i<rows; i++) {
                for (int j=0; j<columns; j++){
                    this.matrix[i][j] = this.matrix[i][j] + matrix.matrix[i][j];
                }
            }
        } else {
            throw new IllegalArgumentException("Matrices with different size cannot be summarized!!!");
            //System.out.println("Matrices with different size cannot be summarized!!!");
        }
    }

    /**
     * Get determinant of current matrix
     * @param matrix
     */
    public int getDeterminant(Matrix matrix){
        int det = 0;
        if (matrix.rows == matrix.columns) {
            int n = matrix.rows; // n - dimension of matrix
            if (n == 1) {
                det = matrix.matrix[0][0];
            } else if (n == 2) {
                det = matrix.matrix[0][0]*matrix.matrix[1][1] - matrix.matrix[0][1]*matrix.matrix[1][0];
            } else if (n == 3) {
                det = matrix.matrix[0][0]*matrix.matrix[1][1]*matrix.matrix[2][2]
                        + matrix.matrix[1][0]*matrix.matrix[2][1]*matrix.matrix[0][2]
                        + matrix.matrix[0][1]*matrix.matrix[1][2]*matrix.matrix[2][0]
                        - (matrix.matrix[0][2]*matrix.matrix[1][1]*matrix.matrix[2][0]
                            + matrix.matrix[2][1]*matrix.matrix[1][2]*matrix.matrix[0][0]
                            + matrix.matrix[1][0]*matrix.matrix[0][1]*matrix.matrix[2][2]
                        );
            } else det =0;
        }
        return det;
    }
    public void getCofactor (Matrix matrix, int r, int c){
        if (matrix.rows == matrix.columns) {
            int n = matrix.rows; // n - dimension of matrix
            if (n == 3) {
                int [][] temp = new int[n-1][n-1];
                
            }
        }
    }


    /**
     * Divide matrix from current matrix
     * @param matrix
     */
    public void divide(Matrix matrix){
        if (this.columns == matrix.rows && matrix.rows == matrix.columns && getDeterminant(matrix)!= 0) {
            
        } else {
            System.out.println("Not possible to divide!!!");
        }

    }

    /**
     * Multiply current matrix on number
     * @param number
     */
    public void multiply(int number){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = matrix[i][j] * number;
            }
        }
    }

    /**
     * Multiply current matrix on matrix
     * @param matrix
     */
    public void multiply(Matrix matrix) {
        if (this.columns == matrix.rows){
            int [][] multipliedMatrix = new int [this.rows][matrix.columns];
            for (int i=0; i<this.rows; i++) {
                for (int j=0; j<matrix.columns; j++) {
                    for (int p=0; p<this.columns; p++) {
                        multipliedMatrix[i][j] += this.matrix[i][p]*matrix.matrix[p][j];
                    }
                }
            }
            this.matrix = multipliedMatrix;
            this.rows = this.matrix.length;
            this.columns = this.matrix[0].length;
        } else {
            System.out.println("Matrices cannot be multiplied!!!");
        }
    }

    /**
     * Print Matrix to console
     */
    public void print(){
        for (int i = 0; i<rows; i++){
            System.out.print("[");
            for (int j = 0; j<columns; j++){
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }

    }

    public int[][] getMatrixArray() {
        return matrix;
    }
}
