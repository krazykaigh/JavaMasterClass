package com.kaideas.udemy.section4CodEx;

public class OperatorChallenge {

  public static void main(String[] args) {
    double dblVar1 = 20.00;
    double dblVar2 = 80.00;

    // Add vars together, then multiply by 100
    double dblVar3 = (dblVar1 + dblVar2) * 100;
    double dblVar4 = dblVar3 % 40;

    // If remainder == 0 set bool to true
    boolean boolRemain = (dblVar4 == 0) ? true: false;

//    if (dblVar4 == 0)
//      boolRemain = true;
//    else
//      boolRemain = false;

      System.out.println(boolRemain);
    if (!boolRemain)
      System.out.println("Got some remainder");

  }
}
