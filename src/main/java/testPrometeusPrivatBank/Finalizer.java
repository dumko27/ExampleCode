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


class Finalizer {
  static int x = 0;
  static boolean gc = false;
  public static void main(String[] args) {
    for(x=0; x<100000; x++) {
      new Finalizer().finalize();
    }
    x = 0;
    gc = true;
    System.gc();
  }
  protected void finalize() {
    if(gc == true) x++;
    if(x % 10000 == 0)
      System.out.println(gc + " " + x);
  }
}