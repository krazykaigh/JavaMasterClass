package com.kaideas.udemy.section5CodEx;

import java.util.Scanner;

public class JMC_74Challenge_MinAndMax {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int minNumber = 0;
    int maxNumber = 0;
    boolean checkInt;

    while (true){
      System.out.println("Enter number: ");
      checkInt= scanner.hasNextInt();
      if (checkInt) {
        int number = scanner.nextInt();
        if (minNumber == 0 && maxNumber == 0) {
          minNumber = maxNumber = number;
        }
        if (maxNumber < number) {
          maxNumber = number;
          System.out.println("New max!");
        }
        else if (minNumber > number){
          minNumber = number;
          System.out.println("New min!");
        }
      }else {
        System.out.println("The minimun entry = " + minNumber);
        System.out.println("The maximun entry = " + maxNumber);
        break;
      }
      scanner.nextLine(); // clear the buffer
    }
    scanner.close();
  }
}
