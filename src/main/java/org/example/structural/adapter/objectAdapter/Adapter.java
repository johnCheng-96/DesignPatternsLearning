package org.example.structural.adapter.objectAdapter;

/**
 * Adapter
 *
 * allows classes with incompatible interfaces to work together by wrapping its own interface around that of an existing class
 */

public class Adapter implements Target{

  private Adaptee adaptee;

  public Adapter(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  @Override
  public int output5v() {
    int i = adaptee.output220v();

    System.out.println(i + " -> 5");

    return 5;
  }
}
