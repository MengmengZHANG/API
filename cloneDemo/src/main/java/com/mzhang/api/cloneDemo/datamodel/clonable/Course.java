package com.mzhang.api.cloneDemo.datamodel.clonable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Course implements Cloneable, Serializable {
  private Person professor;

  private List<Student> students;

  public Course() {
    students = new ArrayList<Student>();
  }

  public void addStudent(Student stu) {
    students.add(stu);
  }

  public Course getClone() throws CloneNotSupportedException {
    return (Course)this.clone();
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    // TODO Auto-generated method stub
    return super.clone();
  }
}
