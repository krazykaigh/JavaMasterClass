package com.kaideas.udemy.section5CodEx;

public class JMC_CodEx18_SharedDigit {

  public static void main(String[] args) {
    System.out.println((hasSharedDigit(12,42)));
  }

  public static boolean hasSharedDigit(int start, int end){
    if (((start >= 10) && (start <=99)) && ((end >= 10) && (end <=99))){
      int startNum1 = start % 10;
      start /= 10;
      int startNum2 = start % 10;

      int endNum1 = end % 10;
      end /= 10;
      int endNum2 = end % 10;

      if ((startNum1==endNum1 || startNum1==endNum2) ||
          (startNum2==endNum1 || startNum2==endNum2)) {
        return true;
      }
    }
      return false;
  }
}

//Write a method named hasSharedDigit with two parameters of type int.
//
//Each number should be within the range of 10 (inclusive) - 99 (inclusive).
// If one of the numbers is not within the range, the method should return false.
//
//The method should return true if there is a digit that appears in both numbers,
// such as 2 in 12 and 23; otherwise, the method should return false.
//
//
//EXAMPLE INPUT/OUTPUT:
//
//* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
//
//* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
//
//* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
//
//
//NOTE: The method hasSharedDigit should be defined as public static like we have been doing so far in the course.
//
//NOTE: Do not add a main method to the solution code.
