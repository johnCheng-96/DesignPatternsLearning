package org.example.flyweight;

public class Tree {

  // immutable
  private final String name;
  private final String data;

  public Tree(String name, String data) {
    this.name = name;
    this.data = data;
    System.out.println(this + "created");

  }

  public String getName() {
    return name;
  }

  public String getData() {
    return data;
  }

  @Override
  public String toString() {
    return "Tree{" +
        "name='" + name + '\'' +
        '}';
  }
}
