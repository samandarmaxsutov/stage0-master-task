package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        String season = switch (monthNumber) {
            case 1, 2, 12 -> "Winter";
            case 4, 5, 3 -> "Spring";
            case 7, 8, 6 -> "Summer";
            case 10, 11, 9  -> "Autumn";
            default -> "Wrong month number";
        };

        System.out.println(season);
    }
    public static void main(String[] args) {
        SeasonDeterminer seasonDeterminer = new SeasonDeterminer();
        seasonDeterminer.tellTheSeason(12);
    }

}
