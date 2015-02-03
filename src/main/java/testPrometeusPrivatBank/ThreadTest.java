package testPrometeusPrivatBank;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package testOp;
//
///**
// *
// * @author Novikov Dmitry
// */
//
//public class ThreadTest  { 
//    class InnerRun implements Runnable { 
//      public void run() {  
//        // do Slow Stuff 
//        System.out.print("Ren "); 
//      } 
//    } 
//    class InnerRunTwo implements Runnable { 
//     Thread other; 
//     InnerRunTwo(Thread t) { other = t; } 
//     public void run() { 
//       other.join(); 
//       System.out.print("Stimpy "); 
//     } 
//   } 
//   void start() { 
//     InnerRun ir = new InnerRun(); 
//     Thread t = new Thread(ir); 
//     InnerRunTwo irr = new InnerRunTwo(t); 
//     Thread u = new Thread(irr); 
//     t.start(); 
//     u.start();       
//   } 
//   public static void main (String[] args) { 
//      ThreadTest tt = new ThreadTest(); 
//      tt.start(); 
//   } 
// } 