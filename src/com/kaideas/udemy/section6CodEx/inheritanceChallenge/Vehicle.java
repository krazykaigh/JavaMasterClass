package com.kaideas.udemy.section6CodEx.inheritanceChallenge;

public class Vehicle {

  private int accelerate_value;
  private int steering_degree;

  public Vehicle(int accelerate_value, int steering_degree) {
    this.accelerate_value = accelerate_value;
    this.steering_degree = steering_degree;
  }

  public int getAccelerate_value() {
    return accelerate_value;
  }

  public void setAccelerate_value(int accelerate_value) {
    this.accelerate_value = accelerate_value;
  }

  public int getSteering_degree() {
    return steering_degree;
  }

  public void setSteering_degree(int steering_degree) {
    this.steering_degree = steering_degree;
  }

  @Override public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Acceration Value: ").append(this.accelerate_value).append("\n");
    sb.append("Steering Degree: ").append(this.steering_degree).append("\n");
    return sb.toString();
  }
}


// Must Haves
// Handle Steering
// Changing Gears
// Acceleration
