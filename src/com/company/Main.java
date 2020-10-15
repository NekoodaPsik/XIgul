package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.println("Welcome to my game");

        int topNumber = 100;
        int userInput = 0;
        Scanner scanner = new Scanner(System.in);

        /*
         * while expression is similar to if except the code between { } runs
         * until the condition of the while is false
         */
        //The user need to enter number that is bigger than topNumber, until he enters it
        //the program will ask him to enter a number

        while(userInput < topNumber){
            System.out.println("Enter number:");
            userInput = scanner.nextInt();
        }

        /*
         * The for expression structure is:
         * for(line of code that runs once usually declare a variable;
         *     condition;
         *     line of code that runs after each execution of the code in the parentheses) { code }
         */

        //In this mini game the player has 3 attempts to enter a number that was predetermined

        int number = 5;
        boolean isCorrectNumber = false;
        for(int i=0; !isCorrectNumber && i < 3; i++){
            System.out.println("Enter number between 0-9");
            userInput = scanner.nextInt();
            if(userInput == number){
                System.out.println("You have entered the correct number");
                isCorrectNumber = true;
            }
        }

        //while version of the above for
        int index = 0;
        isCorrectNumber = false;
        while (!isCorrectNumber && index < 3){
            System.out.println("Enter number between 0-9");
            userInput = scanner.nextInt();
            if(userInput == number){
                System.out.println("You have entered the correct number");
                isCorrectNumber = true;
            }
            index++;
        }

    }
}
