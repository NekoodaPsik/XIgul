package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.println("Welcome to my game");

        // The game
        /*
         * boolean type can have 2 values: true or false
         */
        boolean flag = true;

        /*
         * Conditions:
         * As you can recognize from this word conditions are statement that yield true or false
         * for example : 4 is smaller than 6 is true
         * We have several operators that if used yield a boolean value they are :
         * >, <, == (equality), ! (not), != (not equal), <= (smaller or equal), || (or), && (and)
         * e.g the previous example 4 < 6 ==> true
         */
        int number1 = 4, number2 = 6;
        flag = number1 < number2;

        /*
         * In order to do something useful with this boolean value we need an expression
         * which says do something if the value is true and that where if expression comes in
         * to play
         */

        if(flag){
            System.out.println("The flag is true");
        }

        /*
         * we can add an else expression after the code of the if in order
         * to execute the code if the condition is not true
         */

        if(number1 == number2){
            System.out.println("number1 and number2 are equal");
        } else {
            System.out.println("number1 and number2 are not equal");
        }

        /*
         * more complex example
         */
        int y = 10;
        // if the flag is true and y < 12
        if(flag && y < 12){
            if(number1 == 7){
                System.out.println("number1 less than number2 and y < 12 and number1 equal to 7, therefore we add 90 to number 1");
                number1 = number1 + 90;
            }else{
                System.out.println("number1 less than number2 and y < 12 and number1 not equal to 7 we dont change the value of number1");
            }
        }
    }
}
