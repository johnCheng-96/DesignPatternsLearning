package org.example.behavioral.strategy;

abstract class Zombie {

  Attackable attackable;
  Movable movable;

  public Zombie(Attackable attackable, Movable movable) {
    this.attackable = attackable;
    this.movable = movable;
  }

  abstract void move();
  abstract void attack();

  abstract public void display();

  public Attackable getAttackable() {
    return attackable;
  }

  public void setAttackable(Attackable attackable) {
    this.attackable = attackable;
  }

  public Movable getMovable() {
    return movable;
  }

  public void setMovable(Movable movable) {
    this.movable = movable;
  }
}
