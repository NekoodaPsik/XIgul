package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.println("Welcome to my game");

        String name;
        int age;

        // The object we use to read the console input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you name");
        name = scanner.next();
        System.out.println(name);


        System.out.println("Enter you age");
        age = scanner.nextInt();
        System.out.println(age);

    }
}
