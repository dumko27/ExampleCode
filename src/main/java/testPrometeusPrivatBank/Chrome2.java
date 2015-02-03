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

class X { void go() { System.out.print("x "); } }
class Y extends X {
  void go() { System.out.print("y "); }
}
class Z extends X {
  void go() {
    System.out.print("z ");
  }
}
class Chrome2 {
  public static void main(String [] args) {
    X z = new Z();
    X y = new Y();
    Z y2 = (Z)y;
    z.go();
    y.go();
    y2.go();
  }
}