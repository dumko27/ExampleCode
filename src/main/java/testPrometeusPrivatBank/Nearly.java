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
class Nearly {
  String value;
  Nearly(String v) { value = v; }
  public int hashCode() { return 1; }
  public boolean equals(Nearly n) {
    if(value.charAt(0) == n.value.charAt(0)) return true;
    return false;
  }
  public static void main(String[] sss) {
    Nearly n1 = new Nearly("aaa");
    Nearly n2 = new Nearly("aaa");
    String s = "-";
    if(n1.equals(n2)) s += "1";
    if(n1 == n2) s += "2";
    Set<Nearly> set = new HashSet<Nearly>();
    set.add(n1);
    set.add(n2);
    System.out.println(s + " " + set.size());
  }
} 