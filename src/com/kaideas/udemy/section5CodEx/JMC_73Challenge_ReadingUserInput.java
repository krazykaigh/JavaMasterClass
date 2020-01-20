package com.kaideas.udemy.section5CodEx;

import java.util.Scanner;

public class JMC_73Challenge_ReadingUserInput{

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = 1;
    int sum = 0;
    boolean checkInt;

    do{
      System.out.println("Entry #" +  count + ": ");
      checkInt= scanner.hasNextInt();
      if (checkInt) {
        int number = scanner.nextInt();

        sum += number;
        count++;

      }else
        System.out.println("Invalid entry (non-numerical).");
      scanner.nextLine(); // clear the buffer

    }while (count < 11);

    System.out.println("The sum of valid entries = " + sum);
    scanner.close();
  }

}
