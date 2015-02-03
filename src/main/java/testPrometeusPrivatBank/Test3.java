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
public class Test3 {

    int x;

    public static int adder(int N) {
        return 0x100 + N++;
    }

    public static void main(String[] args) {
        final int i;
        i = 127;
        int b = i;
        System.out.println(b);
        System.out.println("adder(2)="+adder(2));
    }

}
