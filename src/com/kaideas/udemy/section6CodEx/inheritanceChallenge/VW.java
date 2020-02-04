package com.kaideas.udemy.section6CodEx.inheritanceChallenge;

public class VW extends Car {
  private int cylinders;
  private boolean awd;
  private String model;

  public VW(){

  }

  public VW(int cylinders, boolean awd, String model) {
    this.cylinders = cylinders;
    this.awd = awd;
    this.model = model;

  }

  public VW(int accelerate_value, int steering_degree, int numDoors, int gears, int currentGear, String engineType,
      String manufacturer) {
    this(accelerate_value, steering_degree, 2, gears, currentGear, engineType, "VW",
        4, true, "Jetta");
  }


  public VW(int accelerate_value, int steering_degree, int numDoors, int gears, int currentGear, String engineType,
      String manufacturer, int cylinders, boolean awd, String model) {
    super(accelerate_value, steering_degree, numDoors, gears, currentGear, engineType, "VW");

  }

  public int getCylinders() {
    return cylinders;
  }

  public void setCylinders(int cylinders) {
    this.cylinders = cylinders;
  }

  public boolean isAwd() {
    return awd;
  }

  public void setAwd(boolean awd) {
    this.awd = awd;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }
}
