public class InnerClassSingleton {

  private static class SingletonHolder {
    private static InnerClassSingleton instance = new InnerClassSingleton();
  }

  public InnerClassSingleton() {
  }

  public static InnerClassSingleton getInstance() {
    return SingletonHolder.instance;
  }

}
