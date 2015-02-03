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

class Animal { }
class Gerbil extends Animal { }
class Vet {
  Animal go() { return new Animal(); }
}
class SmallAnimalVet extends Vet {
   // Gerbil go() { return new Gerbil(); }  // 7
   // Animal go() { return new Animal(); }  // 8
   // Gerbil go() { return new Animal(); }  // 9
    Animal go() { return new Gerbil(); }  // 10
} 