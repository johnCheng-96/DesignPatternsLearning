package org.example.creational.abstractFactory.impl;


import org.example.creational.abstractFactory.IConnect;

public class OracleConnect implements IConnect {

  @Override
  public void connect() {
    System.out.println("oracle connect");
  }
}
