// Generated by delombok at Fri Nov 14 09:29:31 CET 2014
package com.mzhang.api.lombokDemo;

import java.util.List;

public class Mountain2 {

  private String name;
  private double latitude;
  private double longitude;
  private String country;
  // @NotNull
  private List<Mountain1> mountain1s;

  public static void main(String[] args) {
    Mountain2 mountain = new Mountain2();
    mountain.setCountry(null);
    mountain.setMountain1s(null);
    System.out.println(mountain);
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public java.lang.String toString() {
    return "Mountain2(name=" + this.getName() + ", latitude=" + this.getLatitude() + ", longitude=" + this.getLongitude() + ", country=" + this.getCountry() + ", mountain1s=" + this.getMountain1s() + ")";
  }

  @java.lang.SuppressWarnings("all")
  public void setName(final String name) {
    this.name = name;
  }

  @java.lang.SuppressWarnings("all")
  public String getName() {
    return this.name;
  }

  @java.lang.SuppressWarnings("all")
  public double getLatitude() {
    return this.latitude;
  }

  @java.lang.SuppressWarnings("all")
  public double getLongitude() {
    return this.longitude;
  }

  @java.lang.SuppressWarnings("all")
  public void setCountry(final String country) {
    this.country = country;
  }

  @java.lang.SuppressWarnings("all")
  public String getCountry() {
    return this.country;
  }

  @java.lang.SuppressWarnings("all")
  public void setMountain1s(final List<Mountain1> mountain1s) {
    this.mountain1s = mountain1s;
  }

  @java.lang.SuppressWarnings("all")
  public List<Mountain1> getMountain1s() {
    return this.mountain1s;
  }
}