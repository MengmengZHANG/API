// Generated by delombok at Fri Nov 14 09:29:31 CET 2014
package com.mzhang.api.lombokDemo;
// (callSuper = true)

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

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof Mountain4)) return false;
    final Mountain4 other = (Mountain4)o;
    if (!other.canEqual((java.lang.Object)this)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof Mountain4;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public int hashCode() {
    int result = 1;
    return result;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public java.lang.String toString() {
    return "Mountain4(super=" + super.toString() + ", kilometer=" + this.kilometer + ")";
  }
}