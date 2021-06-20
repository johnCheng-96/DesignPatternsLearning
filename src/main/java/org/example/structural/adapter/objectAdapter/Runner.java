package org.example.structural.adapter.objectAdapter;

public class Runner {

  public static void main(String[] args) {
    Adaptee adaptee = new Adaptee();
    Adapter adapter = new Adapter(adaptee);
    System.out.println(adapter.output5v());
  }

}
