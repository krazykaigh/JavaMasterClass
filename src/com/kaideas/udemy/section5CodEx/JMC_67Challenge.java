package com.kaideas.udemy.section5CodEx;

import java.util.Random;

public class JMC_67Challenge {

  public static void main(String[] args) {
    // create instance of Random class
    Random rand = new Random();

    // Generate random integers in range 0 to 9
    int rand_int1 = rand.nextInt(10);

    // Generate random integers in range 0 to 9
    int rand_int2 = rand.nextInt(25) + rand_int1;

    for (int i = rand_int1; i < rand_int2; i ++){
      System.out.println("The number "  + i +
          (isEvenNumber(i) ? " is even." : " is odd."));
    }
  }

  public static boolean isEvenNumber (int number) {
    if (number < 1)
      return false;
    return ((number % 2 == 0));
  }
}
