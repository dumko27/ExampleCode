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



  interface Face1 { 
    int m1(int a1);  
  } 
  interface Face2 {
   int m2(int a2);  
  } 



abstract class Concrete2 implements Face2, Face1 {
    public int m4(int y) {return 7;}
}

// Ответ C, E
