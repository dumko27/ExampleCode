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
class Apple2 { }
class Macintosh extends Apple {
  public static void main(String[] munch) {
     List<Apple2> a = new ArrayList<Apple2>();
     basket(a);
   }
  static void basket(List<?> list) {list.size(); }
}