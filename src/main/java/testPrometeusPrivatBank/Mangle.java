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
import static java.util.Collections.sort;
class Mangle {
  public static void main(String[] args) {
    List x = new ArrayList();
    x.add(5);
    x.add(new Integer(42));
    x.add(new Integer("17"));
    x.add(new Integer(812).longValue());
    sort(x);
    System.out.println(x);
  }
}
