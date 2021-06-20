package org.example.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TreeFactory {

  /**
   * thread safe
   */
  private static Map<String, Tree> map = new ConcurrentHashMap<>();

  public TreeFactory() {
  }

  public static Tree getTree(String name, String data) {

    /**
     * Lazy
     */
    if (map.containsKey(name)) {
      return map.get(name);
    }

    Tree tree = new Tree(name, data);
    map.put(name, tree);

    return tree;

  }


}
