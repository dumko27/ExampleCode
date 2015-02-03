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


class Under extends Mid {
  static String s = " ";
  public static
  void main(String[] args) {
    Upper u = new Under();
    s = u.go();
    Mid m = (Mid)u;
    System.out.println(s += m.go());
  }
}

class Upper { String go() { return "hi "; } }

class Mid extends Upper { }
