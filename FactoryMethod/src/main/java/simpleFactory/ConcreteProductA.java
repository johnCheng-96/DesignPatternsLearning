package simpleFactory;

public class ConcreteProductA extends Application{

  @Override
  Product createProduct() {
    return new ProductA();
  }
}
