package com.company;

import java.util.Arrays;

/*
 * Extends is the keyword for inheritance.
 */
public class OrcaWhale extends Whale {

    public String[] huntingTactics;

    public OrcaWhale(int length, double weight) {
        /*
         * When class extends other class, it must first call the constructor
         * of the super class (Whale).
         */
        super(length, "Orca", weight);

        this.huntingTactics = new String[2];
        this.huntingTactics[0] = "TacticA";
        this.huntingTactics[1] = "TacticB";
    }

    public void printAge(){
        System.out.print(this.age);
    }

    /*
     * Here we override the length setter of the super class (Whale)
     * and therefore give it new functionality.
     */
    @Override
    public void setLength(int length) {
        if(length <= 0 | length > 15){
            return;
        }
        this.length = length;
    }

    @Override
    public String toString() {
        return "OrcaWhale{" +
                "huntingTactics=" + Arrays.toString(huntingTactics) +
                ", length=" + length +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
}
