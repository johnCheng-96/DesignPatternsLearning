package org.example.creational.abstractFactory.impl;


import org.example.creational.abstractFactory.IConnect;

public class MysqlConnect implements IConnect {

  @Override
  public void connect() {
    System.out.println("mysql connect");
  }
}
