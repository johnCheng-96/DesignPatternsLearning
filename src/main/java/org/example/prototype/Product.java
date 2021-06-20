package org.example.prototype;

public class Product implements Cloneable{

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
    return super.clone();
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
