package com.kaideas.udemy.section5CodEx;

public class JMC_CodEx25_LargestPrime {

  public static void main(String[] args) {
    System.out.println(getLargestPrime(21));
    System.out.println(getLargestPrime(217));
    System.out.println(getLargestPrime(19));
    System.out.println(getLargestPrime(45));
    System.out.println(getLargestPrime(-1));
    System.out.println(getLargestPrime(7));
  }

  public static int getLargestPrime(int findPrime) {
    int largestPrime = 0;
    if (findPrime <0) {
      return -1;
    }
    else {
      // All Factors
      for (int factor = 2; factor <= findPrime; factor++) {
        if (findPrime % factor == 0) {
          // Candidate factor identified
          // is Candidtate factor a Prime Factor
          boolean primeCheck = true;
          while (primeCheck) {
            for (int n = 2; n <= (long) Math.sqrt(factor); n++) {
              // Not a prime
              if (factor % n == 0) {
                primeCheck = false;
                break;
              }
            }
            if (primeCheck) {
              if (largestPrime < factor)
                largestPrime = factor;
              primeCheck = false;
            }
          }
        }
      }
    }
    return (largestPrime > 0) ? largestPrime : -1;
  }
}

// Write a method named getLargestPrime with one parameter of type int named number.
//
//If the number is negative or does not have any prime numbers, the method should
// return -1 to indicate an invalid value.
//
//
//The method should calculate the largest prime factor of a given number and return it.
//
//
//EXAMPLE INPUT/OUTPUT:
//
//* getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
//
//* getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
//
//* getLargestPrime (0); should return -1 since 0 does not have any prime numbers
//
//* getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
//
//* getLargestPrime (-1); should return -1 since the parameter is negative
//
//
//HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.
//
//NOTE: The method getLargestPrime should be defined as public static like we have been doing so far in the course.
//
//NOTE: Do not add a main method to the solution code.
