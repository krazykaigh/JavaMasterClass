package com.kaideas.udemy.section6CodEx.inheritanceChallenge;

public class Car extends Vehicle {

  public static int WHEELS = 4;

  private int numDoors;
  private int gears;
  private int currentGear;

  private String engineType;
  private String manufacturer;

  public Car(){

  }

  public Car(int accelerate_value, int steering_degree) {
    this(accelerate_value, steering_degree,4, 6, 1,
        "Gasoline", "Generic Car");
  }

  public Car(int accelerate_value, int steering_degree,
      int numDoors, int gears, int currentGear, String engineType,
      String manufacturer) {
    super(accelerate_value, steering_degree);
    this.numDoors = numDoors;
    this.gears = gears;
    this.currentGear = currentGear;
    this.engineType = engineType;
    this.manufacturer = manufacturer;
  }

  public int getNumDoors() {
    return numDoors;
  }

  public void setNumDoors(int numDoors) {
    this.numDoors = numDoors;
  }

  public int getGears() {
    return gears;
  }

  public void setGears(int gears) {
    this.gears = gears;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getEngineType() {
    return engineType;
  }

  public void setEngineType(String engineType) {
    this.engineType = engineType;
  }
}
