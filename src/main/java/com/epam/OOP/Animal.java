package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    private String getDescription(String color, int numberOfPaws, boolean hasFur) {
        return numberOfPaws == 1 ? "This animal is mostly " + color + ".It has " + numberOfPaws + " paw and " + (hasFur ? "a " : " no" + " fur.") :
                "This animal is mostly " + color + ".It has " + numberOfPaws + " paws and " + (hasFur ? "a " : " no" + " fur.");
    }
}
