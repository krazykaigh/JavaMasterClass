package com.kaideas.udemy.section4CodEx;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
    }

    public static boolean areEqualByThreeDecimalPlaces(double val1, double val2) {
        val1 *= 1000;
        //System.out.println(val1);
        int intVal1 = (int) val1;
        //System.out.println(intVal1);
        val2 *= 1000;
        //System.out.println(val2);
        int intVal2 = (int) val2;
        //System.out.println(intVal2);
        if (intVal1 == intVal2) {
            return true;
        } else {
            return false;
        }
    }
}

// Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//
//The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
//
//
//EXAMPLES OF INPUT/OUTPUT:
//
//* areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
//
//* areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
//
//* areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
//
//* areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.
//
//
//TIP: Use paper and pencil.
//
//TIP: Use casting.
//
//NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static like we have been doing so far in the course.
//NOTE: Do not add a  main method to solution code.