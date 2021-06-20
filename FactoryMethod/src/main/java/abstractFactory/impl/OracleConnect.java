package abstractFactory.impl;

import abstractFactory.IConnect;

public class OracleConnect implements IConnect {

  @Override
  public void connect() {
    System.out.println("oracle connect");
  }
}
