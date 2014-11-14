package com.mzhang.api.cloneDemo.datamodel.serializable;

import java.io.Serializable;

import lombok.Data;

@Data
public class Person implements Serializable {

  private static final long serialVersionUID = 1L;

  private String name;

  private int age;

  public static void main(String[] args) throws CloneNotSupportedException {
    Person zmm = new Person();
    zmm.setAge(24);
    zmm.setName("Mengmeng ZHANG");
    Person xll = (Person)zmm.clone();
    System.out.println(xll + ", " + xll.hashCode());
    System.out.println(zmm + ", " + zmm.hashCode());
    System.out.println("xll equals zmm? " + zmm.equals(xll));

    System.out.println();
    xll.setName("Yulu ZHANG");
    xll.setAge(23);
    System.out.println(xll + ", " + xll.hashCode());
    System.out.println(zmm + ", " + zmm.hashCode());
    System.out.println("xll equals zmm? " + zmm.equals(xll));
  }
}
