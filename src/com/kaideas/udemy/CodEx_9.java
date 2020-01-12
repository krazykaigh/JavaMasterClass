package com.kaideas.udemy;

public class CodEx_9 {

  public static void main(String[] args) {
    printYearsAndDays(525600);
    printYearsAndDays(1051200);
    printYearsAndDays(561600);
    printYearsAndDays(-678545);
    printYearsAndDays(0);


  }

  public static void printYearsAndDays(long minutes){
    if (minutes < 0)
      System.out.println("Invalid Value");
    else {

      long hours = (int) minutes/60;
      long days = (int) hours/24;
      long years = (int) days/365;
      long remainingDays = days % 365;

      System.out.println(minutes + " min = " + years + " y and " +
          remainingDays + " d");
    }
  }
}
