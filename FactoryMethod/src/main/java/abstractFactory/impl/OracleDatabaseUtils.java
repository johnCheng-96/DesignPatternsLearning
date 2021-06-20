package abstractFactory.impl;

import abstractFactory.ICommand;
import abstractFactory.IConnect;
import abstractFactory.IDatabaseUtils;

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
