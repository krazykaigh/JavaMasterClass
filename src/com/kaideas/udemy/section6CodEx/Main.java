package com.kaideas.udemy.section6CodEx;

import com.kaideas.udemy.section6CodEx.inheritance.Animal;
import com.kaideas.udemy.section6CodEx.inheritance.Dog;
import com.kaideas.udemy.section6CodEx.inheritanceChallenge.Car;
import com.kaideas.udemy.section6CodEx.inheritanceChallenge.VW;
import com.kaideas.udemy.section6CodEx.inheritanceChallenge.Vehicle;

import java.math.BigDecimal;

public class Main {

  public static void main(String[] args) {

    Vehicle vehicle = new Vehicle(3,50);
    Car car = new Car(3, 24, 4, 4, 1,"Gasoline", "Unknown");
    VW vw = new VW(4, 30,4,6,1,"Electric", "Golf RE");



  }

}
//  Animal animal = new Animal("Animal", 1, 1, 5, 5);
//
//  Dog dog = new Dog("MinPin", 2, 16, 2, 4, 1, 20, "Short hair");
//    dog.eat();
//        dog.move(5);
//        dog.move(0);
//        dog.move(20);


//    SimpleCalculator sc = new SimpleCalculator();
//    sc.setFirstNumber(6);
//    sc.setSecondNumber(0);
//    System.out.println(sc.getDivisionResult());

//    Person person = new Person();
//    person.setAge(34);
//    person.setFirstName("Jane");
//    person.setLastName("Johhliagian");
//    System.out.println(person.getFullName());

//    BankAccount bankAccount = new BankAccount();
//    bankAccount.setAccountNumber("1643230-09-0`");
//    bankAccount.setCustomerName("Megan Thee Stallion");
//    bankAccount.setEmailAddress("MeganTheeStallion@gmail.com");
//    bankAccount.setPhoneNumber("(502) 889-2342");
//    bankAccount.setBalance(125430.93);

//    VipCustomer vipCustomer1 = new VipCustomer();
//    VipCustomer vipCustomer2 = new VipCustomer("Tim Teebow", "TimTee78@hotmail.com");
//    VipCustomer vipCustomer3 = new VipCustomer("John Doe", 1500.00, "jd_unknown@email.com");
//
//    System.out.println(vipCustomer1.getName());
//    System.out.println(vipCustomer1.getEmail());
//    System.out.println(vipCustomer1.getCreditLimit() + "\n");
//
//    System.out.println(vipCustomer2.getName());
//    System.out.println(vipCustomer2.getEmail());
//    System.out.println(vipCustomer2.getCreditLimit() + "\n");
//
//    System.out.println(vipCustomer3.getName());
//    System.out.println(vipCustomer3.getEmail());
//    System.out.println(vipCustomer3.getCreditLimit());
