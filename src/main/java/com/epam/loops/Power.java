package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int p = 1;
        for (int i = 1; i <= power; i++) {
            p *= numberToPrint;
        }
        System.out.println(p);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
