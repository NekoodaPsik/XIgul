package com.company;

public class Main {

    public static void main(String[] args) {
        Whale whale1 = new Whale(11, "shark", 2.5);
        Whale whale2 = new Whale(20, "shark", 3.5);
        System.out.println(whale2.toString());
        System.out.println(whale1.toString());
        System.out.println(whale2.isValidWeight());
    }
}
