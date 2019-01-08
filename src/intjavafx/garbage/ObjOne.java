/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjavafx.garbage;

/**
 *
 * @author sandeepkumar
 */
public class ObjOne {
    
    String s = "sandeep";
    String s2 = "Sandeeep kumar";
    
    String name;

    public ObjOne(String name) {
        this.name = name;
    }

    public ObjOne() {
    }

    
    

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
        System.err.println("Garbage collecting " + name);
    }
    
    
    
}
