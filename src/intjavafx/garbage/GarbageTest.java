/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjavafx.garbage;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sandeepkumar
 */
public class GarbageTest {
    
    public static void main(String[] args) {
        
        new GarbageTest().test();
        
    }
    
    public void test() {
        ObjOne obj1 = new ObjOne("Sandeep");
        obj1 = new ObjOne("Kavitha");
        obj1 = new ObjOne("Geo");
        System.gc();
        obj1 = new ObjOne("Gipson");
        obj1 = new ObjOne("Vishnu");
        obj1 =null;
        System.gc();//If this is commented Gipson and vishnu not garbaged,
        //order of garbaging is random
        
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Thread running");
                try {
                    Thread.sleep(15000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(GarbageTest.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        thread.start();
        
    }
    
}
