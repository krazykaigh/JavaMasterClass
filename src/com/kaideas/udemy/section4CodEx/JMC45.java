package com.kaideas.udemy.section4CodEx;

public class JMC45 {

  // Began JMC45 modified to become JMC47 - 49

  public static void main(String[] args) {

    calculateScore(true, 5000, 6, 250);

    calculateScore(true, 10000, 8, 375);

  }

  public static int calculateScore(boolean gm, int scr, int lvlcmp, int bns) {

    if (gm) {
      int finalScore = scr + (lvlcmp * bns);
      System.out.println("Your final score was " + finalScore);

      return finalScore;
    }

    return -1;
  }

}
