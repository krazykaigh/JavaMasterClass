package com.kaideas.udemy.section4CodEx;

public class JMC57 {

  public static void main(String[] args) {
    System.out.println("centimeters = " +
        calcFeetAndInchesToCentimeters(72));
    System.out.println("centimeters = " +
        calcFeetAndInchesToCentimeters(99));
    System.out.println("centimeters = " +
        calcFeetAndInchesToCentimeters(-1));
  }

  public static double calcFeetAndInchesToCentimeters(double feet, double inches){
    if ((feet < 0) || (inches < 0 || inches >12)){
      return -1;
    }
    // convert parameters to inches only
    inches =+ feet * 12;
    // return centimeters
    return inches * 2.54;
  }

  public static double calcFeetAndInchesToCentimeters(double inches){
    if (inches < 0)
      return -1;

    int feet = (int)inches / 12;
    System.out.println("inches = " +inches );
    System.out.println("feet = " + feet);
    inches = (inches % 12);
    System.out.println("remaining inches = " + inches);
    // return centimeters
    return calcFeetAndInchesToCentimeters (feet, inches);
  }
}

