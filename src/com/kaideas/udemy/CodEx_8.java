package com.kaideas.udemy;

public class CodEx_8 {

  // There are no main methods in the actual exercise
  public static void main(String[] args) {

    double radius = 6.9;
    double sideX = 7.3;
    double sideY = 9.2;

    System.out.println("Circle Area with radius " + radius +
        " = " + area(radius));

    System.out.println("Rectangle Area with side x: " + sideX +
        " and side y: " + sideY + ", the area = " + area(sideX, sideY));

  }
  public static double area(double radius){
    if (radius < 0)
      return -1;

    return radius * radius * Math.PI;

  }

  public static double area(double x, double y){
    if (x < 0 || y < 0)
      return -1;

    return x * y ;

  }
}
