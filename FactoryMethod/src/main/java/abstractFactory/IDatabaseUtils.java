package abstractFactory;

public interface IDatabaseUtils {

  ICommand getCommand();
  IConnect getConnect();

}
