package com.kaideas.udemy.section6CodEx.inheritance;

public class Dog extends Animal {

  public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
    super(name, 1, 1, size, weight);
  }

  private void chew() {
    System.out.println("Dog chews bone!");
  }

  @Override
  public void eat() {
    System.out.println("Dogs eat meat and bones.");
    chew();
    super.eat();
  }

  @Override
  public void move(int speed) {
    if (speed <= 5)
      walk(speed);
    else if (speed > 5)
      run(speed);
    super.move(speed);
  }


  private void walk(int walk){
    if (walk < 1)
      walk =1;
    else if (walk > 4)
      walk =4;
    System.out.println("Dog is walking at " + walk + "miles/hour  speed" );
    super.move(walk);
  }

  private void run(int run){
    if(run < 5)
      run = 5;
    else if (run > 15)
      run = 15;
    System.out.println("Dog is runningat " + run + "miles/hour  speed" );
    super.move(run);
  }

}
