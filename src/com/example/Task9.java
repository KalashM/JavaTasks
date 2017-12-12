package com.example;

public class Task9 {
    public static int[][][][][][] sixDimensionalArray (int size) {

        int[][][][][][] sixDimArray = new int[size][size][size][size][size][size];
        int k=1;
        for (int i1=0; i1< size; i1++){
            for (int i2=0; i2< size; i2++){
                for (int i3=0; i3< size; i3++){
                    for (int i4=0; i4< size; i4++){
                        for (int i5=0; i5< size; i5++){
                            for (int i6=0; i6< size; i6++){
                                sixDimArray[i1][i2][i3][i4][i5][i6] = k;
                                k++;
                            }
                        }
                    }
                }
            }
        }
        return sixDimArray;

    }
}
