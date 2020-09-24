package com.company;

public class Main {

    /**
     * This function is the entry point for the program
     * The code run sequentially one line each time
     * Each line need to end with ; that tell the JVM that
     * it is end of one expression
     */
    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to my game");
        //Opening
        System.out.println("In this screen there are "+9+" free spots");
        System.out.println("In every spot there are "+2+" options");
        System.out.println("Over all there are "+18+" options for the board at the end of the game");

        // The game

        /*
         * In this lesson we showed 3 types : int, double, char
         * To declare new variable to hold some data from a specific type use the format:
         * Variable_type Variable_name;
         * To initialize the variable with some value use the = operator :
         * Variable_type Variable_name = value ;
         */
        int spots    =     9;
        int options = 2; // X or O

        int sum= spots * options;

        /* There are 4 basic operator +, -, *, / as you know it
         * Use them with int and double, for char you may research online at this point
         * or wait until will discuss it in some of the next lessons
         */

        System.out.println("Over all there are "+sum+" options for the board at the end of the game");

        System.out.println("Over all there are "+sum+" options for the board at the end of the game");

        System.out.println("Over all there are "+sum+" options for the board at the end of the game");

        double pointsForRound = 1.5;
        double d_turns = 9;

        double allPointsInGame = d_turns*pointsForRound;

        System.out.println("All points:" + "tam tam: " + allPointsInGame);

        char first ='d';
        char second = 'n';

        System.out.println("First player: "+first+ "Second player: "+second);

        int x = 20;
        int y = 50;
        int su2 = x + y;

        double z = 6.9;
        double t = 100000.5;
        double sum3 = z * t;

        int num1 = 1;
        int num2 = 1;

        System.out.println(num1*num2);

        num1++; // == num1=num1+1;
        num2++; // == num2=num2+1;
        System.out.println(num1*num2);






    }
}
