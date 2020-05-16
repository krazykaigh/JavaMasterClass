package com.kaideas.udemy.section4CodEx;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
        System.out.println(hasEqualSum(-0,0, 3));
    }
    public static boolean hasEqualSum(int val1, int val2, int val3){
        return val1 + val2 == val3;
    }
}
