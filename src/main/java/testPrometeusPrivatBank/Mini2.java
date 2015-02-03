/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPrometeusPrivatBank;

/**
 *
 * @author Novikov Dmitry
 */

class Car2 {
  static int i1 = 5;
  int i2 = 6;
  public static void m1() { System.out.print(i1); }
  public void m2() { System.out.print(i2); }
}

class Mini2 extends Car2 {
  static int i1 = 7;
  int i2 = 8;
  public static void m1() { System.out.print(i1); }
  public void m2() { System.out.print(i2); }
  public static void main(String[] args) {
    Car2 c = new Mini2();
    c.m1();
    System.out.print(" " + c.i1 + c.i2);
  }
}
