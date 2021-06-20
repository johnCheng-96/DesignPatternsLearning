package org.example.creational.abstractFactory.impl;


import org.example.creational.abstractFactory.ICommand;
import org.example.creational.abstractFactory.IConnect;
import org.example.creational.abstractFactory.IDatabaseUtils;

public class OracleDatabaseUtils implements IDatabaseUtils {

  @Override
  public ICommand getCommand() {
    return new OracleCommand();
  }

  @Override
  public IConnect getConnect() {
    return new OracleConnect();
  }
}
