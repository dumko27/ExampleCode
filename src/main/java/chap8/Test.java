/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap8;

/**
 *
 * @author Novikov Dmitry
 */

  public class Test { 
    public static int y; 
    public static int foo(int x) { 
      System.out.print("foo "); 
      return y = x; 
    } 
    public static int bar(int z) { 
      System.out.print("bar "); 
      return y = z; 
   } 
   public static void main(String [] args ) { 
     int t = 2; 
     assert t < 4 : bar(7); 
     assert t > 1 : foo(8); 
     System.out.println("done"); 
   } 
 } 
