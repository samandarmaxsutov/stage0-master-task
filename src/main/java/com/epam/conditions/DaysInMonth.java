package com.epam.conditions;

public class DaysInMonth {
    private int checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) return 29;
        return 28;
    }
    public void printDays(int year, int month) {
        if (year < 0) {
            System.out.println("invalid date");
            return;
        }

        if (month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        int daysInMonth =switch (month) {
            case 2 -> checkYear(year);
            case 4,6,9,11->30; // April,June,September,November
            default->31;//
        };

        System.out.println(daysInMonth);
    }
}
