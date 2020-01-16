package com.kaideas.udemy.section5CodEx;

import java.util.Random;

public class JMC_69Challenge {

  public static void main(String[] args) {
    // create instance of Random class
    Random rand = new Random();
    for (int i = 0; i < 10; i++) {
      // Generate random integers in range 0 to 9999
      int rand_int1 = rand.nextInt(10000);
      System.out.println("The sum of the digits in " + rand_int1 + " = " + sumDigits(rand_int1));
    }
  }

  public static int sumDigits(int number){
    if (number >=10){
       int sum = 0;
      do{
        int calcNum = number %  10;
        number /= 10;
        sum += calcNum;
      }while (number != 0);
      return sum;
    }
    return -1;
  }
}
