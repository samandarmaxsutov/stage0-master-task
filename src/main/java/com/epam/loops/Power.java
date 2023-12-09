package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int a=numberToPrint;
        for (int i = 1; i <power; i++) {
            a*=numberToPrint;
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
