package org.example.creational.factoryMethod;

public class ConcreteProductA extends Application {

  @Override
  Product createProduct() {
    return new ProductA();
  }
}
