package com.kaideas.udemy.section6CodEx.inheritanceChallenge;

public class Car extends Vehicle {

  private int numWheels;
  private boolean awd;
  private int numDoors;
  private String manufacturer;
  private String model;

  public Car(int accelerate_value, int steering_degree) {
    super(accelerate_value, steering_degree);
  }
}
