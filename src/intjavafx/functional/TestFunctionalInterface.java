/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjavafx.functional;

/**
 *
 * @author sandeep
 */
@FunctionalInterface
public interface TestFunctionalInterface {
    
    public int functionalMethod(int a, int b);
    default public void display() {
        System.err.println("display");
    }
    
    public static void display2() {
        System.err.println("display2");
    }
    
}
