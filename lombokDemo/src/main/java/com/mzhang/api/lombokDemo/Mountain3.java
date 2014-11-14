package com.mzhang.api.lombokDemo;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString(callSuper = true)
public class Mountain3 extends Mountain2 {

  private int kilometer;

  public static void main(String[] args) {
    Mountain3 mountain = new Mountain3();
    System.out.println(mountain);
    System.out.println(mountain.hashCode());
  }

}
