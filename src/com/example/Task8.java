package com.example;

import java.util.Arrays;

public class Task8 {
    public static char[][] chessArray (int row, int col) {
        char[][] arrayChess = new char[row][col];
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                if ((i%2 == 0 && j%2 == 0) || (i%2 != 0 && j%2 != 0)) {
                    arrayChess[i][j] = 'b';
                } else if ((i%2 != 0 && j%2 == 0) || (i%2 == 0 && j%2!= 0) ){
                    arrayChess[i][j] = 'w';
                }
            }
        }
        return arrayChess;
    }
}
