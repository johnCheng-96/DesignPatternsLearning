package org.example.structural.flyweight;

/**
 * flyweight
 *
 * definition:
 * effectively support large amount of find-grained objects using sharing technology
 *
 * Pros:
 * if app has a lot of similar objects, save memory and cpu resources
 *
 * Use cases in JDK:
 * String, Integer, Long...
 * InstructionConstraints
 */
public class Runner {

  public static void main(String[] args) {
    TreeNode treeNode1 = new TreeNode(1, 1, TreeFactory.getTree("xxx", "xxxdata"));
    TreeNode treeNode2 = new TreeNode(1, 2, TreeFactory.getTree("xxx", "xxxdata"));
    TreeNode treeNode3 = new TreeNode(2, 2, TreeFactory.getTree("yyy", "yyydata"));
    TreeNode treeNode4 = new TreeNode(2, 3, TreeFactory.getTree("yyy", "yyydata"));



  }

}
