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

import java.util.*;
class Metric {
  public static void main(String[] args) {
    String[] s = {"inch", "foot", "yard", "rod", "meter"};
    List list = Arrays.asList(s);
    list.set(4, "chain");
    System.out.print(s[4]);
    s[2] = "meter";
    System.out.print(" " + list.get(2));
  }
} 