package com.kaideas.udemy.section5CodEx;

import java.util.Random;

public class JMC_64Challenge {

  public static void main(String[] args) {
    // create instance of Random class
    Random rand = new Random();

    // Generate random integers in range 0 to 9
    int rand_int1 = rand.nextInt(1000);
    System.out.println("lower boundary: " + rand_int1);

    // Generate random integers in range 0 to 9
    int rand_int2 = rand.nextInt(10);
    System.out.println("upper boundary: " + rand_int1* rand_int2);

    int countPrimes = 0;

    for (int i = rand_int1; i <= rand_int1*rand_int2; i++){
      if (isPrime(i)){
        System.out.println(i + " is a Prime number");
        countPrimes++;
        if (countPrimes == 10)
          break;

      }
    }

//    for (int i = 8; i>1; i--){
//      System.out.println("10,000 at " + i + "% interest = "
//        + String.format("%.2f", calculateInterest(10000, i)));
//    }
  }

  public static double calculateInterest(double amount, double interestRate){
    return(amount *(interestRate/100));
  }

  public static boolean isPrime(int n){
    if (n == 1){
      return false;
    }

    for(int i=2; i <= (long) Math.sqrt(n); i++){
      if(n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
