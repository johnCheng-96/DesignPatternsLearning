package org.example.structural.decorator;

public class ConcreteCamera implements Camera {

  @Override
  public void operation() {
    System.out.println("take photos");
  }
}
