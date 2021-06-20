package simpleFactory;

public class ConcreteProductB extends Application{

  @Override
  Product createProduct() {
    return new ProductB();
  }
}
