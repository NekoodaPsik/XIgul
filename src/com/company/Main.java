package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //print from 1 to 4 not included
        printNumberFromToAndBack(1, 4);

        int[] array = {1,1,1,1,1,100,1,1};
        System.out.print("we found the ket in " + frogGame(array, 0) + " steps");
    }

    /*
     * This recursive function print the numbers from a given number to a given another number
     * and print it also backwards
     */
    public static void printNumberFromToAndBack(int from, int to){
        //if we got the the top number we return
        if(from == to){
            return;
        }
        System.out.println(from);

        //recursive call while we increment the from to print it.
        printNumberFromToAndBack(from+1, to);

        //after the recursive call we print the from again, this line is the backwards printing
        System.out.println(from);
    }

    /*
     * More easy version of what we explained in the video
     * Each time the frog can leap one or three steps. Therefore
     * the maximum number of steps are all one (the array length - 1)
     */
    public static int frogGame(int[] array, int location){
        // if we didnt find the key(number 100) if want to return large number, bigger
        // than the maximum number of steps therefore we return the array length.
        if(array.length <= location){
            return array.length;
        }

        // we found the key then we return 0
        if(array[location] == 100){
            return 0;
        } else {
            //calculate the number of steps it will take if we were in the +1 and +3 location
            // and add 1 to add the jump
            int oneStep = 1 + frogGame(array, location + 1);
            int threeStep = 1 + frogGame(array, location + 3);

            //find the minimum between those two
            if(oneStep < threeStep){
                return oneStep;
            } else {
                return threeStep;
            }
        }
    }

}
