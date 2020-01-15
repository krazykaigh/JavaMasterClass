package com.kaideas.udemy.section5CodEx;

public class JMC_66Challenge {

  public static void main(String[] args) {
    int counter = 0;
    int sum = 0;

    for (int i = 1; i <= 1000; i++) {
      if ((i % 3 == 0) && (i % 5 == 0)) {
        System.out.println(i + " is a number divisible by 3 and 5.");
        sum += i;
        counter++;
        if (counter == 5)
          break;
      }
    }
    System.out.println("Sum of numbers divisible by 3 and 5 = " + sum);
  }
}
