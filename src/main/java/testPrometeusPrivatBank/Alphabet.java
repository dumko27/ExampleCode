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

public class Alphabet extends Thread {
  public synchronized void run() {
    try {
      System.out.println("A");
      wait();
      System.out.println("B");
      notify();
      System.out.println("C");
      wait(1);
      System.out.println("D");
      notifyAll();
      System.out.println("E");
    } catch (Exception e) {
      System.out.println("F");
    } finally {
      System.out.println("G");
    }
  }
  public static void main(String[] args) {
    new Alphabet().start();
  }
}

// Ответ А
