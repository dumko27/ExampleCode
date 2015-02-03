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




public class Test2 { 
    public static void throwex () { 
    System.out.print("throwex "); 
      throw new RuntimeException(); 
    } 
    public static void main(String [] args) { 
      try { 
        System.out.print("try "); 
        throwex(); 
     } 
     catch(Exception re ) { 
       System.out.print("catch "); 
     } 
     finally { 
       System.out.print("finally "); 
     } 
     System.out.println("done "); 
   } 
 } 