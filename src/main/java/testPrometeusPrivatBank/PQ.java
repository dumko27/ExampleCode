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

import java.util.*;
public class PQ {
  public static void main(String[] args) {
    Comparator<Integer> cmp = new Comparator<Integer>() {
      public int compare(Integer n1, Integer n2) {
        return n2.compareTo(n1);
      }
    };
    PriorityQueue<Integer> q = new PriorityQueue<Integer>(100, cmp);
    q.addAll(Arrays.asList(16, 8, 42, 15, 4, 23));
    System.out.println(q.poll());
  }
} 
