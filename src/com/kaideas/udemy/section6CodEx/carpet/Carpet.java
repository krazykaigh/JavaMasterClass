package com.kaideas.udemy.section6CodEx.carpet;

public class Carpet {
  private double cost;

  public Carpet(double cost) {
    if (cost < 0)
      cost = 0;
    this.cost = cost;
  }

  public double getCost() {
    return cost;
  }
}
