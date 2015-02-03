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
class Aaa  {
 	int xxx;
 	void yyy() { xxx = 1; }
        
        public static void main(String[] args) {
            Bbb b = new Bbb();
            b.yyy();
        }
 }


 class Bbb extends Aaa {
 	final Aaa finalref = new Aaa();

 	final void yyy() {
 		System.out.println("In method yyy()");
 		finalref.xxx = 12345;
 	}
 }