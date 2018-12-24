/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewtest.serializable;

import java.io.Serializable;

/**
 *
 * @author sandeep
 */
public class ObjectOne implements Serializable{
    
    public static int rollNo = 123;
    
    int salary = 10000;
    String name = "Sample name";
    
    ObjectTwo objectTwo = new ObjectTwo();

    @Override
    public int hashCode() {
        return 2342; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
