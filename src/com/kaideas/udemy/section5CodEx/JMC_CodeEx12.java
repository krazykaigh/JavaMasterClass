package com.kaideas.udemy.section5CodEx;

import java.util.Random;

public class JMC_CodeEx12 {

  public static void main(String[] args) {
    // create instance of Random class
    Random rand = new Random();

    // Generate random integers in range 0 to 9
    System.out.println("This is the switch statement");
    for (int i = 0; i < 5; i++){
      int rand_int1 = rand.nextInt(15);
      printNumberInWord(rand_int1);
    }
  }

  public static void printNumberInWord(int num) {
    switch (num){
      case 0:
        System.out.println("ZERO");
        break;
      case 1:
        System.out.println("ONE");
        break;
      case 2:
        System.out.println("TWO");
        break;
      case 3:
        System.out.println("THREE");
        break;
      case 4:
        System.out.println("FOUR");
        break;
      case 5:
        System.out.println("FIVE");
        break;
      case 6:
        System.out.println("SIX");
        break;
      case 7:
        System.out.println("SEVEN");
        break;
      case 8:
        System.out.println("EIGHT");
        break;
      case 9:
        System.out.println("NINE");
        break;
      default:
        System.out.println("OTHER");
        break;
    }
  }

}
