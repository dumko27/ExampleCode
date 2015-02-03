/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Novikov Dmitry
 */

 public class Alphabet {
    public static void main(String [] args) {
      Alphabet t = new Alphabet();
      t.start();
    }
    void start() {
      String s1 = "one";
      String s2 = alter(s1);
     System.out.println(s1 + " " + s2);
   }
   String alter(String s1) {
     s1 = s1 + " two";
     System.out.print(s1 + " ");
     return "three";
   }
 }
