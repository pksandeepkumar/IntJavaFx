/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjavafx.interface_abstract;

/**
 *
 * @author sandeepkumar
 */
public interface InterfaceOne {
    
    public void method1();
    
    default public void defaultInterfaceOneMethod() {
        System.err.println("defaultInterfaceOneMethod");
    }
    
    static void staticInterfaceOneMethod() {
        System.err.println("defaultInterfaceOneMethod");
    }
    
}
