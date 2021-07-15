package org.example.behavioral.strategy;

public class FlagZombie extends Zombie{

  public FlagZombie() {
    super(new BiteAttack(), new StepByStepMove());
  }

  public FlagZombie(Attackable attackable, Movable movable) {
    super(attackable, movable);
  }

  @Override
  void move() {
    movable.move();
  }

  @Override
  void attack() {
    attackable.attack();
  }

  @Override
  public void display() {
    System.out.println("Flag Zombie");
  }
}
