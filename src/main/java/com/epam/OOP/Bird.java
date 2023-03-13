package com.epam.OOP;

public class Bird extends  Animal{
    private int numberOfWings;

    public Bird(String color, int numberOfPaws, boolean hasFur, int numberOfWings) {
        super(color, numberOfPaws, hasFur);
        this.numberOfWings = numberOfWings;
    }

    @Override
    public String getDescription(String color, int numberOfPaws, boolean hasFur) {
        return numberOfPaws == 1 ?
                "This animal is mostly " + color + ".It has " + numberOfPaws + " paw and " + (hasFur ? "a " : " no" + " fur.") :
                "This animal is mostly " + color + ".It has " + numberOfPaws + " paws and " + (hasFur ? "a " : " no" + " fur. Moreover, it has 2 wings and can fly.");
    }


}
