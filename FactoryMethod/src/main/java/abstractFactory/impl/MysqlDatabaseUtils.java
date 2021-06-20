package abstractFactory.impl;

import abstractFactory.ICommand;
import abstractFactory.IConnect;
import abstractFactory.IDatabaseUtils;

public class MysqlDatabaseUtils implements IDatabaseUtils {

  @Override
  public ICommand getCommand() {
    return new MysqlCommand();
  }

  @Override
  public IConnect getConnect() {
    return new MysqlConnect();
  }
}
