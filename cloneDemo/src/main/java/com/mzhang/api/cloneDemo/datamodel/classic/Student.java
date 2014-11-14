package com.mzhang.api.cloneDemo.datamodel.classic;

import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Student extends Person {
  @Setter
  private String school;

  public static void main(String args[]) throws CloneNotSupportedException {
    Student zmm = new Student();
    zmm.setAge(24);
    zmm.setName("Mengmeng ZHANG");
    zmm.setSchool("Yangxin school");

    Student xll = (Student)zmm.clone();
    System.out.println(xll + ", " + xll.hashCode());
    System.out.println(zmm + ", " + zmm.hashCode());
    System.out.println("xll equals zmm? " + zmm.equals(xll));

    System.out.println();
    xll.setName("Yulu ZHANG");
    xll.setAge(23);
    xll.setSchool("Handan school");
    System.out.println(xll + ", " + xll.hashCode());
    System.out.println(zmm + ", " + zmm.hashCode());
    System.out.println("xll equals zmm? " + zmm.equals(xll));
  }
}
