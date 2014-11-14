package com.mzhang.api.lombokDemo;

import lombok.Data;


@Data
public class Mountain1 {

  private final String name;

  private final double latitude, longitude;

  private String country;
}
