package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
         * We are creating an array of size 5 that hold only integers
         * Arrays are continuous memory you can invasion them as follows:
         *         index     0   1   2   3
         *         array  | 1 | 10 | 4 | 5 |
         * To change or get a value in the array we need to use the [] operator
         * Set the value of index 1 in the array (the second member) varName[1] = value
         */
        int[] intArray = new int[4];
        intArray[0] = 1;
        intArray[1] = 10;
        intArray[2] = 4;
        intArray[3] = 5;

        System.out.println("1D array:");
        // Print all the values in the array
        for(int i=0; i < intArray.length; ++i){
            System.out.println(intArray[i]);
        }

        /*
         * 2D array or array of arrays
         * int[][] is the type were the first [] is the index of rows and
         * the second [] is the index of the columns for example
         * int[][] array2D = new int[3][3]  array with 3 rows and 3 columns
         * array2D[1][2] the value in the second row(index 1) and the third column(index 2)
         */
        int[][] int2DArray = new int[3][3];

        int2DArray[0][0] = 1; int2DArray[0][1] = 2; int2DArray[0][2] = 3;
        int2DArray[1][0] = 4; int2DArray[1][1] = 5; int2DArray[1][2] = 6;
        int2DArray[2][0] = 7; int2DArray[2][1] = 8; int2DArray[2][2] = 9;

        System.out.println("\n2D array:");
        // Print all the values in the 2D array
        for(int i=0; i < int2DArray.length; i++){
            for(int j=0; j < int2DArray[0].length; j++) {
                System.out.print(int2DArray[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
