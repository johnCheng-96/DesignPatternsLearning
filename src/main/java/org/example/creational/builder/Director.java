package org.example.creational.builder;

public class Director {

  private ProductBuilder builder;

  public Director(ProductBuilder builder) {
    this.builder = builder;
  }

  public Product makeProduct(String productName, String companyName, String part1, String part2,
      String part3, String part4) {
    builder.buildProductName(productName);
    builder.buildCompanyName(companyName);
    builder.buildPart1(part1);
    builder.buildPart2(part2);
    builder.buildPart3(part3);
    builder.buildPart4(part4);

    return builder.buildProduct();

  }

}
