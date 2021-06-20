package abstractFactory.impl;

import abstractFactory.ICommand;

public class MysqlCommand implements ICommand {

  @Override
  public void command() {
    System.out.println("mysql command");
  }
}
