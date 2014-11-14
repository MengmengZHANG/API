package com.mzhang.api.lombokDemo;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Mountain2 {

  @Setter
  @Getter
  private String name;

  @Getter
  private double latitude, longitude;

  @Setter
  @Getter
  private String country;

  @Setter
  @Getter
  // @NotNull
  private List<Mountain1> mountain1s;

  public static void main(String[] args) {
    Mountain2 mountain = new Mountain2();
    mountain.setCountry(null);
    mountain.setMountain1s(null);
    System.out.println(mountain);
  }

}
