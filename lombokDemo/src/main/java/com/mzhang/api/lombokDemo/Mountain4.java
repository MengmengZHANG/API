package com.mzhang.api.lombokDemo;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(exclude = "kilometer")
// (callSuper = true)
@ToString(callSuper = true)
public class Mountain4 extends Mountain2 {

  private int kilometer;

  public static void main(String[] args) {
    Mountain4 mountain4 = new Mountain4();
    System.out.println(mountain4);
    System.out.println(mountain4.hashCode());
    Mountain3 mountain3 = new Mountain3();
    System.out.println(mountain3);
    System.out.println(mountain3.hashCode());
    System.out.println(mountain3.equals(mountain4));
  }

}
