/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPrometeusPrivatBank;
//
/**
 *
 * @author Novikov Dmitry
 */

public class Test {
    public static void main(String [] args) {
      Test t = new Test();
     t.start();
   }
   void start() {
     long [] a1 = {1,2,3};
    long [] a2 = adjust(a1);
     System.out.print(a2[0] + a2[1] + a2[2] + " ");
     System.out.println(a1[0] + a1[1] + a1[2]);
   }
   long [] adjust(long [] a3) {
     a3[2] = 4;
     return a3;
   }
 }
//
//
//import java.io.*;
//  public class Test {
//    public static void main(String [] args) {
//     FileInputStream in = null;
//      try { 
//       in = new FileInputStream("test.txt");
//        int x = in.read();  
//      }  
//     catch(IOException io) { 
//       System.out.println("IO Error."); 
//     } 
//     finally { 
//       in.close(); 
//     } 
//   } 
// }
//
//public class Test {
//   public static void main(String [] args) {
//     Test t = new Test();
//    t.start();
//  }
//   void start() {
//     String s1 = "one";
//     String s2 = alter(s1);
//     System.out.println(s1 + " " + s2);
//   }
//   String alter(String s1) {
//     s1 = s1 + " two";
//     System.out.print(s1 + " ");
//     return "three";
//   }
// }
// ответ B: one two one three
//
//  public class Test { 
//    public static int y; 
//    public static int foo(int x) { 
//      System.out.print("foo "); 
//      return y = x; 
//    } 
//    public static int bar(int z) { 
//      System.out.print("bar "); 
//      return y = z; 
//   } 
//   public static void main(String [] args ) { 
//     int t = 2; 
//     assert t < 4 : bar(7); 
//     assert t > 1 : foo(8); 
//     System.out.println("done"); 
//   } 
// } 