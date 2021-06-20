package org.example.structural.facede;

/**
 * Facede
 *
 * provide simplified interface to a large amount of code
 *
 * Use case:
 * Structure subsystems into layers
 *
 * Pros:
 * simplifying codes
 *
 * Use case in source code:
 * RequestFacede
 */

public class Facede {

  public static void doSomethingFacede() {
    Subsystem1.doSomething();
    Subsystem2.doSomething();
    Subsystem3.doSomething();

  }

}
