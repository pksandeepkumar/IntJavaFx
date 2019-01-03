/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjavafx.polymorphism;

/**
 *
 * @author sandeep
 */
public class PolymorphismTest {
    
    
    public void test() {
        
        Parent p = new Child();
        p.method1();
        p.method2();
        
//        Output
//        Child method1()
//        Parent method2()
//        Child method1()
                
    }
}
