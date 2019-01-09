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
public abstract class Abstract extends Parent implements InterfaceTwo {
    
    public abstract void abstractMethod();

    @Override
    public void method2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
