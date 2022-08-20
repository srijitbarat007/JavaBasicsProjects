package com.javaprojects.speedconverter;

public class SpeedConverter {

    //1 mile per hour is 1.609 kilometers per hour
    private static final double COMMON_CONSTANTS = 1.609;

    //toMilesPerHour(...) is used to convert the kilometers per hour into miles per hour
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }else {
            long milesPerHour = Math.round(kilometersPerHour / COMMON_CONSTANTS);
            return milesPerHour;
        }
    }

    //This method is used to print the Km/h to mi/h conversion
    public static void printConversion(double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if(milesPerHour<0){
            System.out.println("Invalid Value");
        }else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
}
