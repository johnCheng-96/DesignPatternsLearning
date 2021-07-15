package org.example.behavioral.strategy;

public class StepByStepMove implements Movable{

  @Override
  public void move() {
    System.out.println("move step by step");
  }
}
