package abstractFactory.impl;

import abstractFactory.ICommand;

public class OracleCommand implements ICommand {

  @Override
  public void command() {
    System.out.println("oracle command");
  }
}
