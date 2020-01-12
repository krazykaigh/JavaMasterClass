package com.kaideas.udemy;

public class JMC59 {

  public static void main(String[] args) {
    System.out.println(getDurationSTring(302, 34));
    System.out.println(getDurationSTring(-2, 0));
    System.out.println("    ---------------  ---------------- ");
    System.out.println(getDurationSTring(18154));
    System.out.println(getDurationSTring(0));
    System.out.println(getDurationSTring(3418744));

  }
  public static String getDurationSTring(int minutes, int seconds) {
    if ((minutes < 0) || (seconds < 0 || seconds > 59))
      return "Invalid value";
      int hours = minutes / 60;
      minutes %= 60;
      return (hours +"h:" + minutes + "m:" + seconds + "s");
  }

  public static String getDurationSTring(int seconds) {
    if (seconds < 0)
      return "Invalid value";

    int minutes = seconds  / 60;
    seconds %= 60;

    return getDurationSTring(minutes, seconds);
  }

}
