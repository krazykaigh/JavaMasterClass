package com.kaideas.udemy.section4CodEx;

public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(15);
        printConversion(0);
        printConversion(98);
        printConversion(-1);
    }
    public static long toMilesPerHour (double kilometersPerHour) {
        if (kilometersPerHour < 0 ){
            return -1L;
        }
        return Math.round(kilometersPerHour / 1.609 );
    }
    public static void printConversion(double kilometersPerHour){
        // "XX km/h = YY mi/h"
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesperhour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " +
                    milesperhour + " mi/h");
        }
   }
}
