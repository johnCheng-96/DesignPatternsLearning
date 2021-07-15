package org.example.behavioral.strategy;

public class BiteAttack implements Attackable{

  @Override
  public void attack() {
    System.out.println("Bite");
  }
}
