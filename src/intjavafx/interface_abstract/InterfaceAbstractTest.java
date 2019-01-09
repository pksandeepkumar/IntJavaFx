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
public class InterfaceAbstractTest extends Abstract{

    @Override
    public void method2() {
        System.err.println("method2 implementation");
    }

    @Override
    public void method1() {
        System.err.println("method1 implementation");
    }

    @Override
    public void abstractMethod() {
        System.err.println("abstractMethod implementation");
    }
    
    public static void main(String[] args) {
        InterfaceOne.staticInterfaceOneMethod();
        new InterfaceAbstractTest().abstractMethod();
        new InterfaceAbstractTest().defaultInterfaceOneMethod();
        //Interface cannot extends abstract class
//        Interface can extends another interface
// Abstract cannot extends another interface
//Abstract can implement interface, but no need to provide implementation means 
// implementation is not mandatory
    }
    
}
