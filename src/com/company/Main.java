package com.company;

import java.util.Scanner;

public class Main {

    /*
     * In order to organize the code and make it more general and easy
     * to change we need functions. function have name, input parameters, return value
     * and code.
     * The variables you declare in the function exist only in its scope example next.
     */

    /*
     * Here the function called print, have input parameter of type String called string
     * and no return type of void (no return value)
     */
    public static void print(String string){
        System.out.println(string);
    }

    public static void print(int number){
        System.out.println(number);
    }

    /*
     * Here the function called multiply, have 2 input parameters of type int called a and b.
     * Also, return type of int
     * the variables a, b exist only in the scope of the function (the curly brackets)
     */
    public static int multiply(int a, int b){
       return a * b;
    }

    public static void addOneToLocalVarA(int a){
        a = a + 1;
    }

    public static void main(String[] args) {
        //Here we call the function print with one parameter
        print("We are using functions!");

        //Here we call multiply function with a = 5 and b = 2 and assign the return value to mul var.
        int mul = multiply(5, 2);

        /*
         * Notice in the next code we declare a in main function (here) and we have a in multiply.
         * They are different a variable each exist independent of the other one in the scope of its function.
         */
        int a = 5;
        print("Before we call the function addOneToLocalVarA");
        print(a);
        print("After we call the function addOneToLocalVarA");
        print(a);

        print("Printing the matrix");
        char[][] matrix = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
        printMatrix(matrix);
    }

    /*
     * This function will print our tic tac tow matrix
     * if an entry is X or O we print it otherwise we print the index
     * In the game we will initialize this array first so this function just print
     * the matrix as a tic tac tow matrix.
     */
    public static void printMatrix(char[][] matrix){
         for(int i=0; i<matrix.length; i++){
             for(int j=0; j<matrix.length-1; j++){
                 System.out.print(" " + matrix[i][j] + " |");
             }
             System.out.println(" " +matrix[i][matrix.length-1]);
             System.out.println("------------");
         }
    }
}
