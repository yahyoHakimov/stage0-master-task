package com.epam.OOP;

public class Dog extends Animal{

    public Dog() {
        super("brown", 4, true);
    }

    @Override
    public String getDescription(String color, int numberOfPaws, boolean hasFur) {
        return numberOfPaws == 1 ? "This animal is mostly " + color + ".It has " + numberOfPaws + " paw and " + (hasFur ? "a " : " no" + " fur.") :
                "This animal is mostly " + color + ".It has " + numberOfPaws + " paws and " + (hasFur ? "a " : " no" + " fur.");
    }
}
