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

 class Plant { 
   String getName() { return "plant"; } 
   Plant getType() { return this; } 
 } 
 class Flower extends Plant { 
   // insert code here 
   //Какие варианты возвращаемых значений корректны с точки зрения Java 5?

    //Flower getType() { return this; }
    //String getType() { return "this"; }
    //Plant getType() { return this; }
    Tulip getType() { return new Tulip(); }
    
    // Ответ A, C, D
 } 
 class Tulip extends Plant { }
