package com.kaideas.udemy;

public class JMC48 {

  public static void main(String[] args) {
    String[] name = {"John", "Fanny", "Peter", "Lisa"};
    int[] score = {1500, 900, 400, 50};

    for (int i = 0; i < score.length; i++){
      displayHighScorePosition(name[i], calculateHighScorePosition(score[i]));
    }
  }
  public static void displayHighScorePosition(String name, int hiScorPos){

    String[] numbith = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth"};

    System.out.println(name + " achieved honor by attaining the " + numbith[hiScorPos - 1] +
        " position, on the high score table." );
  }

  public static int calculateHighScorePosition(int score) {
    int position = 4;
    if (score >= 1000) {
      position = 1;
    }
    else if (score >= 500) {
      position = 2;
    }
    else if (score >= 100) {
      position = 3;
    } return position;
  }
}
