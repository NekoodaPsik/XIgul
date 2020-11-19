package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Game variables
        char[][] gameMatrix;
        // ture is X turn
        boolean isXorOTurn = true;
        boolean isInGame = true;
        int boxIndexPicked = -1;
        int numberOfTakenBoxes = 0;
        Scanner scanner = new Scanner(System.in);

        //Clean the game
        gameMatrix = getClean2DCharArray(3, 3);

        println("Welcome to my game");

        while (isInGame) {
            printMatrix(gameMatrix);

            if(isXorOTurn) {
                println("This is X turn");
            } else {
                println("This is O turn");
            }

            println("Enter the free box index 1-9");
            boxIndexPicked = getUserInputMatrixIndex(scanner);

            if(isFreeBox(gameMatrix, boxIndexPicked)){
                boxIndexPicked--;
                int row = boxIndexPicked / 3;
                int column = boxIndexPicked % 3;

                numberOfTakenBoxes ++;
                if(isXorOTurn) {
                    gameMatrix[row][column] = 'X';
                    isXorOTurn = false;
                } else {
                    gameMatrix[row][column] = 'O';
                    isXorOTurn = true;
                }

                if(checkWinning(gameMatrix, row, column)){
                    isInGame = false;
                    println("The player "+ gameMatrix[row][column] +" won!");
                }
            }
            if(numberOfTakenBoxes == 9){
                isInGame = false;
                println("No winner at this round");
            }
        }
        printMatrix(gameMatrix);
    }

    /**
     * Create a char 2D array and fill it with char that represent
     * the index in it. Start from '1' fill it by row.
     * @param rows The numbers of rows in the array
     * @param columns The number of columns in the array
     * @return 2D char array
     */
    public static char[][] getClean2DCharArray(int rows, int columns) {
        char boxNumber = '1';
        char[][] arr = new char[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = boxNumber++;
            }
        }
        return arr;
    }

    /**
     * Print the game matrix
     * @param array The game matrix 2D array
     */
    public static void printMatrix(char[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(" " + array[i][j] + " ");
                if(j != array.length-1){
                    printMatrix("|");
                }
            }
            println("");

            if(i != array.length-1)
                for (int j = 0; j < 11; j++) {
                    printMatrix("-");
                }
            println("");
        }
    }

    /**
     * Get valid user index (1-9)
     * @param scanner The scanner to read from
     * @return Valid index
     */
    public static int getUserInputMatrixIndex(Scanner scanner){
        int inputIndex = -1;

        while(inputIndex < 0 || inputIndex > 9){
            inputIndex = scanner.nextInt();

            if(inputIndex < 0 || inputIndex > 9) {
                println("Not valid input!");
                println("Enter the free box index 1-9");
            }
        }

        return inputIndex;
    }

    /**
     * Check if the game matrix is free in the given index
     * @param array The game matrix
     * @param boxIndex index represent the box of the in the game matrix (1-9)
     * @return true if the spot in the array is not 'X' or 'O'
     */
    public static boolean isFreeBox(char[][] array, int boxIndex){
        boxIndex--;
        int row = boxIndex / 3;
        int column = boxIndex % 3;
        return array[row][column] != 'X' && array[row][column] != 'O';
    }

    /**
     * Check the hole line or column of the char in the matrix spot (row, column)
     * are filled with the same char, if so that is a win. Also check if it can be
     * a diagonal win
     * @param array the game matrix
     * @param row char row
     * @param column char column
     * @return true if it was a winning move.
     */
    public static boolean checkWinning(char[][] array, int row, int column){
        char charToCheck = array[row][column];
        boolean won = true;
        //check row
        for(int col=0; col < array.length; col++){
            if(array[row][col] != charToCheck){
                won = false;
                break;
            }
        }
        if(won){
            return won;
        }

        //check column
        won = true;
        for(int r=0; r < array.length; r++){
            if(array[r][column] != charToCheck){
                won = false;
                break;
            }
        }
        if(won){
            return won;
        }

        //check diagonal
        if(array[1][1] == charToCheck) {
            if (array[0][0] == charToCheck && array[2][2] == charToCheck) {
                return true;
            }
            if (array[0][2] == charToCheck && array[2][0] == charToCheck) {
                return true;
            }
        }

        return false;
    }

    public static void printMatrix(String message){
        System.out.print(message);
    }

    public static void println(String message){
        System.out.println(message);
    }
}
