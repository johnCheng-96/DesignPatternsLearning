package org.example.prototype;

public class BaseInfo {

  private String companyName;

  public BaseInfo(String companyName) {
    this.companyName = companyName;
  }

  public String getCompanyName() {
    return companyName;
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
