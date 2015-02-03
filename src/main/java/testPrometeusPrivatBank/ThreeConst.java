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



 public class ThreeConst { 
   public static void main(String [] args) { 
      new ThreeConst(4L); 
   } 
   public ThreeConst(int x) { 
      this(); 
      System.out.print(" " + (x * 2)); 
    } 
    public ThreeConst(long x) { 
     this((int) x); 
     System.out.print(" " + x); 
  } 
 
   public ThreeConst() { 
     System.out.print("no-arg "); 
   } 
 }