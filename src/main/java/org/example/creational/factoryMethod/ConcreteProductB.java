package org.example.creational.factoryMethod;

public class ConcreteProductB extends Application {

  @Override
  Product createProduct() {
    return new ProductB();
  }
}
