package com.javaprojects.secondsandminuteschallenge;

public class SecondsAndMinutesChallenge {

    public static String getDurationString(long minutes, long seconds){
        long hour = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hour + "h " + remainingMinutes + "m "+ seconds + "s";
    }

    public static String getDurationString(long seconds){
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes,remainingSeconds);
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(445));
    }
}
