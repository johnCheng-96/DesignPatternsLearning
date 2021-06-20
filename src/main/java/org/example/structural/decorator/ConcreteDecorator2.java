package org.example.structural.decorator;

public class ConcreteDecorator2 extends Decorator{

  public ConcreteDecorator2(Camera camera) {
    super(camera);
  }

  @Override
  public void operation() {
    System.out.println("add filter function");
    camera.operation();
  }
}
