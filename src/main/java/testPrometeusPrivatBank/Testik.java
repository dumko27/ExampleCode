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
public class Testik {
    
    public static void main(String[] args) {
        int I = 0; 
 outer: 
   while (true) { 
     I++; 
     inner: 
       for (int j = 0; j < 10; j++) { 
         I += j; 
         if (j == 3) 
           continue inner; 
         break outer; 
       } 
       continue outer; 
    } 
 System.out.println(I); 


    }
    
}
