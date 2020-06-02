package com.dev.java8.numberToOrdinal;

public class NumberToOrdinal {

    public static String numberToOrdinal(Integer number) {

        int hundredRemaining = number % 100;
        int tensRemaining = number % 10;
        if (number == 0) {
            return number.toString();
        }
        if (hundredRemaining - tensRemaining == 10) {
            return number + "th";
        }
        switch (tensRemaining) {
            case 1:
                return number + "st";
            case 2:
                return number + "nd";
            case 3:
                return number + "rd";
            default:
                return number + "th";
        }

    }

}
