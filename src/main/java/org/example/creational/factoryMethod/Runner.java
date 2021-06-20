package org.example.creational.factoryMethod;

public class Runner {

  public static void main(String[] args) {
    /**
     * 1. decoupling
     * 2. open-closed
     * 3. single responsibility
     */
    Application app = new ConcreteProductB();
    Product product = app.getProduct();
    product.method1();
  }

}
