package org.example.structural.adapter.classAdapter;

/**
 * Adapter
 *
 * allows classes with incompatible interfaces to work together by wrapping its own interface around that of an existing class
 *
 * Use cases:
 * 1. when you want to use some classes, but the interface is not compatible with your codes
 * 2. when you want to reuse some existing sub-classes, these sub-classes need to have functions that cannot be added to the super class
 *
 * Pros:
 * 1. S in SOLID
 * 2. O in SOLID
 *
 * Use cases in JDK:
 * 1. Arrays.asList()
 * 2. Collections.list()
 * 3. Spring
 *    1. GenericApplicationListenerAdapter (Object adapter)
 */

/**
 * Cons of this way:
 * this adapter has two methods, output5v and output220v, hence our interface is "contaminated"
 * our target only supposes to have only output5v()
 */
public class Adapter extends Adaptee implements Target {

  @Override
  public int output5v() {
    int i = output220v();

    System.out.println(i + " -> 5");

    return 5;
  }
}
