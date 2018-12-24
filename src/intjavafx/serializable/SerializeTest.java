/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjavafx.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author sandeep
 */
public class SerializeTest {
    
    public void doSerializeTest() {
        
        ObjectOne objectOne = new ObjectOne();
        System.out.println("objectOne.hashCode():" + objectOne.hashCode());
        String filename = "serialize.txt"; 
          
        // Serialization  
        try
        {    
            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            // Method for serialization of object 
            out.writeObject(objectOne); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
  
        } 
          
        catch(IOException ex) 
        { 
            ex.printStackTrace();
            System.out.println("IOException is caught"); 
        } 
    }
    
    public void deSerializationTest() {
        
        ObjectOne object1 = null; 
        String filename = "serialize.txt"; 
  
        // Deserialization 
        try
        {    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream(filename); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            // Method for deserialization of object 
            object1 = (ObjectOne)in.readObject(); 
              
            in.close(); 
            file.close(); 
              
            System.out.println("Object has been deserialized "); 
            System.out.println("name = " + object1.name); 
            System.out.println("salary = " + object1.salary); 
        } 
          
        catch(IOException ex) 
        { 
            ex.printStackTrace();
            System.out.println("IOException is caught"); 
        } 
          
        catch(ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        } 
    }
    
}
