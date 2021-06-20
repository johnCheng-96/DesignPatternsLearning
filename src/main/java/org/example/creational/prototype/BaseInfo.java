package org.example.creational.prototype;

import java.io.Serializable;

/**
 * impl Cloneable to make independent of clone objects and original object
 * as well as ensuring "deep clone" / "deep copying"
 * Serializable not necessary
 */

public class BaseInfo implements Cloneable, Serializable {

  private String companyName;

  public BaseInfo(String companyName) {
    this.companyName = companyName;
  }

  public String getCompanyName() {
    return companyName;
  }

  // for "deep clone"
  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  @Override
  public String toString() {
    return this.hashCode() + " ] BaseInfo{" +
        "companyName='" + companyName + '\'' +
        '}';
  }
}
