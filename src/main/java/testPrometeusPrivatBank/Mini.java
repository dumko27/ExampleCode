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


class Car {
  public static void m1() { System.out.print("a "); }
  public void m2() { System.out.print("b "); }
}
class Mini extends Car {
  public static void m1() { System.out.print("c "); }
  public void m2() {
    System.out.print("d ");
  }
  public static void main(String[] args) {
    Car c = new Mini();
    c.m1();
    c.m2();
  }
}