package abstractFactory.impl;

import abstractFactory.IConnect;

public class MysqlConnect implements IConnect {

  @Override
  public void connect() {
    System.out.println("mysql connect");
  }
}
