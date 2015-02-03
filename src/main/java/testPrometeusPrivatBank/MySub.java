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

 class MySuper { 
    public MySuper(int i) { 
      System.out.println("super " + i); 
    } 
  } 
 
  public class MySub extends MySuper { 
    public MySub() { 
      super(2); 
     System.out.println("sub"); 
   } 

   public static void main(String [] args) { 
     MySuper sup = new MySub(); 
   } 
 }