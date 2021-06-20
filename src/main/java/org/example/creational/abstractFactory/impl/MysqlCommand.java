package org.example.creational.abstractFactory.impl;


import org.example.creational.abstractFactory.ICommand;

public class MysqlCommand implements ICommand {

  @Override
  public void command() {
    System.out.println("mysql command");
  }
}
