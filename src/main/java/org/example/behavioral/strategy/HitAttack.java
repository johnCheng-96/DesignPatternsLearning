package org.example.behavioral.strategy;

public class HitAttack implements Attackable{

  @Override
  public void attack() {
    System.out.println("Hit");
  }
}
