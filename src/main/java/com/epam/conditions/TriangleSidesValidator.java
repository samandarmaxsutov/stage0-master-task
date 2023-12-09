package com.epam.conditions;

public class TriangleSidesValidator {

    private boolean checkTriangleSides(double a,double b,double c){
        return a+b>c&&a+c>b&&b+c>a;
    }
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (checkTriangleSides(firstSide, secondSide, thirdSide)) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }

}
