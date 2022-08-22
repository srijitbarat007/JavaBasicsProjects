package com.javaprojects.decimalcomparator;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double one, double two){
        int a = (int) (one * 1000);
        int b = (int) (two * 1000);
        System.out.println(a + " == " + b);
        if(a==b)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.176,3.175));
    }
}
