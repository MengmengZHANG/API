package com.mzhang.api.cloneDemo.datamodel.clonable;

import lombok.Data;

@Data
public class Person1 {
  private String name;

  private int age;

  @Override
  protected Person1 clone() throws CloneNotSupportedException {
    Person1 newPerson = new Person1();
    newPerson.setAge(this.age);
    newPerson.setName(this.name);
    return newPerson;
  }

  public static void main(String[] args) throws CloneNotSupportedException {
    Person1 zmm = new Person1();
    zmm.setAge(24);
    zmm.setName("Mengmeng ZHANG");
    Person1 xll = zmm.clone();
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
