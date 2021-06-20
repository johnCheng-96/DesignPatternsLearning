package simpleFactory;

public class SimpleFactory {

  public static Product createProduct(String type) {
    if ("0".equals(type)){
      return new ProductA();
    } else if ("1".equals(type)){
      return new ProductB();
    } else {
      return null;
    }
  }

}
