package builder;

public class Runner {

  public static void main(String[] args) {
    DefaultConcreteProductBuilder defaultConcreteProductBuilder = new DefaultConcreteProductBuilder();
    Director director = new Director(defaultConcreteProductBuilder);
    Product product = director.makeProduct("productA", "companyA", "1", "2", "3", "4");
    System.out.println(product);
  }

}
