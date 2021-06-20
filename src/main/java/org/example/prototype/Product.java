package org.example.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



/**
 * Prototype
 *
 * Use case:
 * when code should not depend on object, which needs to be cloned, of a concrete class
 *
 * Pros:
 * 1. copy object without coupling with concrete class
 * 2. prevent duplicate codes
 * 3. ease of constructing complex object
 */

/**
 * Serializable not necessary
 */
public class Product implements Cloneable, Serializable {

  private static final long serialVersionUID = 42L;
  private String part1;
  private String part2;
  private int part3;
  private int part4;
  private int part5;
  private BaseInfo baseInfo;

  public Product() {
  }

  public Product(String part1, String part2, int part3, int part4, int part5,
      BaseInfo baseInfo) {
    this.part1 = part1;
    this.part2 = part2;
    this.part3 = part3;
    this.part4 = part4;
    this.part5 = part5;
    this.baseInfo = baseInfo;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {

    /**
     * "deep clone" and achieve independent
     * version 1 using Cloneable interface
     */
//    Product clone = (Product) super.clone();
//    BaseInfo cloneBaseInfo = ((BaseInfo) baseInfo.clone());
//    clone.setBaseInfo(cloneBaseInfo);
//    return clone;

    /**
     * version 2: using Serializable interface, not recommended,  more expensive
     */

    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

    try (ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream)) {
      oos.writeObject(this);
    } catch (IOException e) {
      e.printStackTrace();
    }


    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
        byteArrayOutputStream.toByteArray());

    Product object = null;
    try (ObjectInputStream ois = new ObjectInputStream(byteArrayInputStream)) {
      object = (Product) ois.readObject();

    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    return object;

  }

  public String getPart1() {
    return part1;
  }

  public void setPart1(String part1) {
    this.part1 = part1;
  }

  public String getPart2() {
    return part2;
  }

  public void setPart2(String part2) {
    this.part2 = part2;
  }

  public int getPart3() {
    return part3;
  }

  public void setPart3(int part3) {
    this.part3 = part3;
  }

  public int getPart4() {
    return part4;
  }

  public void setPart4(int part4) {
    this.part4 = part4;
  }

  public int getPart5() {
    return part5;
  }

  public void setPart5(int part5) {
    this.part5 = part5;
  }

  public BaseInfo getBaseInfo() {
    return baseInfo;
  }

  public void setBaseInfo(BaseInfo baseInfo) {
    this.baseInfo = baseInfo;
  }

  @Override
  public String toString() {
    return this.hashCode() + " ] Product{" +
        "part1='" + part1 + '\'' +
        ", part2='" + part2 + '\'' +
        ", part3=" + part3 +
        ", part4=" + part4 +
        ", part5=" + part5 +
        ", baseInfo=" + baseInfo +
        '}';
  }
}
