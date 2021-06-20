package org.example.creational.abstractFactory;

public interface IDatabaseUtils {

  ICommand getCommand();
  IConnect getConnect();

}
