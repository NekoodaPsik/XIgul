package com.company;

public class Main {

    public static void main(String[] args) {
        Whale whale1 = new Whale(11, "shark", 2.5);
        Whale whale2 = new OrcaWhale(20, 3.5);

        Whale[] whales = {whale1, whale2};

        for(Whale w : whales){
            System.out.println(w.toString());
        }
    }
}
