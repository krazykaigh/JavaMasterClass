package com.kaideas.udemy.section5CodEx;

import java.util.Random;

public class JMC_63Challenge {

  public static void main(String[] args) {
    // create instance of Random class
    Random rand = new Random();

    // Generate random integers in range 0 to 9
    System.out.println("This is the switch statement");
    for (int i = 0; i < 5; i++){
      int rand_int1 = rand.nextInt(10);
      printDayOfTheWeek(rand_int1);
    }
    System.out.println("\n ---------------------------- \n");
    System.out.println("This is the if statement");
    for (int i = 0; i < 5; i++){
      int rand_int1 = rand.nextInt(10);
      determineDayOfTheWeek(rand_int1);
    }
  }

  public static void printDayOfTheWeek(int day) {
    switch (day){
      case 0:
        System.out.println("Today is Sunday");
        break;
      case 1:
        System.out.println("Today is Monday");
        break;
      case 2:
        System.out.println("Today is Tuesday");
        break;
      case 3:
        System.out.println("Today is Wednesday");
        break;
      case 4:
        System.out.println("Today is Thursday");
        break;
      case 5:
        System.out.println("Today is Friday");
        break;
      case 6:
        System.out.println("Today is Saturday");
        break;
      default:
        System.out.println("An invalid number was entered!");
        break;
    }
  }

  public static void determineDayOfTheWeek(int day) {
    if (day == 0)
      System.out.println("Today is Sunday");
    else if (day == 1)
      System.out.println("Today is Monday");
    else if (day == 2)
      System.out.println("Today is Tuesday");
    else if (day == 3)
      System.out.println("Today is Wednesday");
    else if (day == 4)
      System.out.println("Today is Thursday");
    else if (day == 5)
      System.out.println("Today is Friday");
    else if (day == 6)
      System.out.println("Today is Saturday");
    else
      System.out.println("An invalid number was entered!");
  }
}
