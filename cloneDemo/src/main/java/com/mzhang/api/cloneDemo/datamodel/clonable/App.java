package com.mzhang.api.cloneDemo.datamodel.clonable;

public class App {
  /**
   * @param args
   * @throws CloneNotSupportedException
   */
  public static void main(String args[]) throws CloneNotSupportedException {
    Person zmm = new Person();
    zmm.setAge(24);
    zmm.setName("Mengmeng ZHANG");

    Student xll = new Student();
    xll.setName("Yulu ZHANG");
    xll.setAge(23);
    xll.setSchool("Handan school");

    Course course = new Course();
    course.setProfessor(zmm);
    course.addStudent(xll);
    // Course course2 = course.getClone();
    Course course2 = (Course)course.clone();

    System.out.println(course + ", " + course.hashCode());
    System.out.println(course2 + ", " + course2.hashCode());
    System.out.println("course equals course1? " + course.equals(course2));
    System.out.println();

    course2.getProfessor().setAge(20);
    System.out.println(course + ", " + course.hashCode());
    System.out.println(course2 + ", " + course2.hashCode());
    System.out.println("course2 equals course1? " + course.equals(course2));
    System.out.println();

    Course course3 = (Course)course.clone();
    Student student = course3.getStudents().get(0);
    student.setAge(21);
    System.out.println(course + ", " + course.hashCode());
    System.out.println(course2 + ", " + course2.hashCode());
    System.out.println(course3 + ", " + course3.hashCode());
    System.out.println("course3 equals course? " + course3.equals(course));
    System.out.println();
  }
}
