package org.example.prototype;

public class Runner {

  public static void main(String[] args) throws CloneNotSupportedException {
    Product xxx = new Product("1", "2", 3, 4, 5, new BaseInfo("xxx"));
    System.out.println(xxx);

    Product clonexxx = ((Product) xxx.clone());
    System.out.println(clonexxx);
  }

}
