package com.kaideas.udemy.section6CodEx;

public class VipCustomer {
  private String name;
  private double creditLimit;
  private String email;

  public VipCustomer() {
    this("J DOE", 750.00, "jdoe@email.com");
  }

  public VipCustomer(String name, String email) {
   this(name, 1000.00, email);

  }

  public VipCustomer(String name, double creditLimit, String email) {
    this.name = name;
    this.creditLimit = creditLimit;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public double getCreditLimit() {
    return creditLimit;
  }

  public String getEmail() {
    return email;
  }
}
