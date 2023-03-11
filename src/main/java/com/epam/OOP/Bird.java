package com.epam.OOP;

public class Bird extends  Animal{
    private int numberOfWings;

    public Bird(String color, int numberOfPaws, boolean hasFur, int numberOfWings) {
        super(color, numberOfPaws, hasFur);
        this.numberOfWings = numberOfWings;
    }

//    @Override
//    protected String getDescription() {
//        String animalDescription = super.getDescription();
//
//        return " Moreover, it has " + numberOfWings + " wings and can fly.";
//
//    }


}
