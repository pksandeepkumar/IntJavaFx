/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjavafx.interfacetest;

/**
 *
 * @author sandeep
 */
public interface SampleInterface extends Parent, Parent2{//Here we cannot extends two classes,
    //but we can extends two interfaces
    
    public int sampleInterfaceMethod();
}
