package com.kaideas.udemy.section5CodEx;

public class JMC_62Challenge {

  public static void main(String[] args) {
    switchChar('V');
    switchChar('A');
    switchChar('C');
    switchChar('E');
  }
  public static void switchChar(char chr){
    switch (chr){
      case 'A':
        System.out.println("The character is " + chr);
        break;
      case 'B':
        System.out.println("The character is " + chr);
        break;
      case 'C':
        System.out.println("The character is " + chr);
        break;
      case 'D':
        System.out.println("The character is " + chr);
        break;
      case 'E':
        System.out.println("The character is " + chr);
        break;
      default:
        System.out.println("The character was not A, B, C, D, nor E. The character was " + chr);
        break;
    }
  }
}
