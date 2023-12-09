package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {//489
        int rNumber = 0;// rNumber = 0

        while (number != 0) { // 489!=0 // 48!=0
            int digit = number % 10;//digit = 9 // = 8// 4
            rNumber = rNumber*10 + digit; //rNumber = 0*10+9 // 9*10+8 // 98*10+4
            number /= 10; //number =48 //= 4 // = 0
        }

        System.out.println(rNumber); // 984
    }


}
