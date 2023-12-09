package com.epam.OOP;

public class Animal {
    private String color;//color
    private int numberOfPaws;// number of paws
    private boolean hasFur; // has 

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String furDescription = hasFur ? "a fur" : "no fur";
        String pawDescription = numberOfPaws == 1 ? "paw" : "paws";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + pawDescription + " and " + furDescription + ".";
    }
}
