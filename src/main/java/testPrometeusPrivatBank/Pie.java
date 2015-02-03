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


class Food { }
class Fruit extends Food { }
class Apple extends Fruit { } 
//class Pie<T extends Food> {
//class Pie<T extends Fruit> {
//class Pie<T extends Apple> {
//class Pie<T extends Pie> {
class Pie<T> {
  public static void main(String[] munch) {
    Pie<Fruit> p = new Pie<Fruit>();
  }
}
