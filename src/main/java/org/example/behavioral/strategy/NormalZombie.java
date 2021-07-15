package org.example.behavioral.strategy;

public class NormalZombie extends Zombie{

  public NormalZombie() {
    super(new BiteAttack(), new StepByStepMove());
  }

  public NormalZombie(Attackable attackable, Movable movable) {
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

    System.out.println("Normal Zombie");

  }
}
