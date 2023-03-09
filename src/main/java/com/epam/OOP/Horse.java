package com.epam.OOP;

//This is optional work in order to want to know more
public class Horse extends Animal {
    public Horse(String color, int numberOfPaws, boolean hasFur) {
        super("green", 4, true);
    }

    @Override
    public String getDescription(String color, int numberOfPaws, boolean hasFur) {
        return numberOfPaws == 1 ? "This animal is mostly " + color + ".It has " + numberOfPaws + " paw and " + (hasFur ? "a " : " no" + " fur.") :
                "This animal is mostly " + color + ".It has " + numberOfPaws + " paws and " + (hasFur ? "a " : " no" + " fur.");
    }
}
