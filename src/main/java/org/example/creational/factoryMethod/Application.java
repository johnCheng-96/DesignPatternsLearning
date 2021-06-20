package org.example.creational.factoryMethod;

// open-closed principle
abstract class Application {

  abstract Product createProduct();

  Product getProduct() {
    return createProduct();
  }

}
