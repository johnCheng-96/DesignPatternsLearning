package org.example.prototype;

public class Runner {

  public static void main(String[] args) throws CloneNotSupportedException {
    Product xxx = new Product("1", "2", 3, 4, 5, new BaseInfo("xxx"));
    Product clonexxx = ((Product) xxx.clone());
    System.out.println(xxx);
    System.out.println(clonexxx);

    // without BaseInfo implementing Cloneable and overriding clone(),
    // setCompanyName method will apply change to both xxx and clonexxx
    // BaseInfo will show the same hashcode (i.e. xxx and clonexxx are not independent)
    // So we need to fix this problem by letting BaseInfo impl Cloneable and clone(),
    // and calls BaseInfo's clone() in Product's clone() method
    xxx.getBaseInfo().setCompanyName("yyy");
    System.out.println(xxx);
    System.out.println(clonexxx);



  }

}
