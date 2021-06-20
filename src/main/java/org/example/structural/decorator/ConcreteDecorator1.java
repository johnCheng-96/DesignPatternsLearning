package org.example.structural.decorator;

public class ConcreteDecorator1 extends Decorator{

  public ConcreteDecorator1(Camera camera) {
    super(camera);
  }

  @Override
  public void operation() {
    System.out.println("add beautify function");
    camera.operation();
  }
}
