package org.example.structural.decorator;

public class Runner {

  public static void main(String[] args) {
    ConcreteCamera concreteCamera = new ConcreteCamera();
    concreteCamera.operation();

    ConcreteDecorator1 concreteDecorator1 = new ConcreteDecorator1(concreteCamera);
    concreteDecorator1.operation();

    ConcreteDecorator2 concreteDecorator2 = new ConcreteDecorator2(concreteDecorator1);
    concreteDecorator2.operation();
  }

}
