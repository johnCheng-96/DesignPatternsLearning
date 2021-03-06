package org.example.creational.abstractFactory;


import org.example.creational.abstractFactory.impl.OracleDatabaseUtils;

public class Runner {


  public static void main(String[] args) {
    /**
     *
     * pros:
     * 1. decoupling
     * 2. object from factory are compatible with each other
     * 3. open-closed
     * 4. single responsibility
     */
    IDatabaseUtils utils = new OracleDatabaseUtils();
    ICommand command = utils.getCommand();
    command.command();

    IConnect connect = utils.getConnect();
    connect.connect();
  }

}
