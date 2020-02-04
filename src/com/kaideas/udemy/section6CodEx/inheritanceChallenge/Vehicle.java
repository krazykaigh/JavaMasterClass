package com.kaideas.udemy.section6CodEx.inheritanceChallenge;

public class Vehicle {

  private int accelerate_value;
  private int steering_degree;

  public Vehicle(){

  }

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
    if (steering_degree > 35){
      System.out.println("Steering degree value to high. Auto set to maximum: 35");
      steering_degree = 35;
    } else if (steering_degree < 20){
      System.out.println("Steering degree value to low. Auto set to minimum: 20");
      steering_degree = 20;
    }

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
