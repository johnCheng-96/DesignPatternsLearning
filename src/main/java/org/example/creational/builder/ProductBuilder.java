package org.example.creational.builder;

public interface ProductBuilder {
  void buildProductName(String productName);
  void buildCompanyName(String companyName);
  void buildPart1(String part1);
  void buildPart2(String part2);
  void buildPart3(String part3);
  void buildPart4(String part4);
  Product buildProduct();

}
