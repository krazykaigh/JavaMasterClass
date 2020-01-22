package com.kaideas.udemy.section6CodEx;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class BankAccount {
// Bank Account Challenge
  private String accountNumber;
  private BigDecimal balance;
  private String customerName;
  private String emailAddress;
  private String phoneNumber;
  NumberFormat usCurrency = NumberFormat.getCurrencyInstance();

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public BankAccount() {
    this.accountNumber = "00000-00-00";
    this.balance = BigDecimal.valueOf(500.00);
    this.customerName = "None";
    this.emailAddress = "email@address";
    this.phoneNumber = "(000) 000-0000";
  }

  public void depositFunds(@NotNull BigDecimal deposit){
    if (deposit.compareTo(BigDecimal.ZERO)>0) {
      balance = (balance.add(deposit));
      System.out.println("Deposit of " + usCurrency.format(deposit) + " completed.");
      System.out.println("New balance = " + usCurrency.format(balance));

    } else
      System.out.println("Invalid depsosit amount. Transaction cancelled.");

  }

  public void withdrawalFunds(@NotNull BigDecimal withdrawal) {
    if (withdrawal.compareTo(BigDecimal.ZERO) <=0 || balance.subtract(withdrawal).compareTo(BigDecimal.ZERO) < 0)  {
      System.out.println("Invalid withdrawal amount. Transaction cancelled.");

    }
    else {
      balance = (balance.subtract(withdrawal));
      System.out.println("Withdrawal of " + usCurrency.format(withdrawal) + " completed.");
      System.out.println("New balance = " + usCurrency.format(getBalance()));

    }
  }

}
