package org.example.creational.abstractFactory.impl;


import org.example.creational.abstractFactory.ICommand;

public class OracleCommand implements ICommand {

  @Override
  public void command() {
    System.out.println("oracle command");
  }
}
