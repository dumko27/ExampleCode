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

public class Switch2 { 
    public static void main(String [] args) { 
      int y = 0; 
       
      for (int x=3; x >= 0; x--) {
       switch (x) { 
          case 3: y = y + 100; 
          case 2: y = y + 10; 
          case 1: break;  
         case 0: y = y + 1;
       } 
     } 
     System.out.println(y); 
   } 
 }