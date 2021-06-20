public class HungrySingleton {

  private static HungrySingleton instance = new HungrySingleton();

  private HungrySingleton() {

    // prevent using reflection create more than one instance

    if (instance != null) {
      throw new RuntimeException("Singleton does not allow more than one instance");
    }
  }

  public static HungrySingleton getInstance() {
    return instance;
  }
}
