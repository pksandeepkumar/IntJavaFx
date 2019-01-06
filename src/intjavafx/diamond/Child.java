/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjavafx.diamond;

/**
 *
 * @author sandeepkumar
 */
public class Child implements  Parent1, Parent2{
    
    public static void main(String[] args) {
        new Child().method();
    }
    
    //To solve diamond problem you must implement in child class
    public void method() {
        System.err.println("Child implementation...");
    }
    
    
    
}
