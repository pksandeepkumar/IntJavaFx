/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewtest.hashing;

import java.util.HashMap;

/**
 *
 * @author sandeep
 */
public class HashTest {
    
    HashMap<Key, String> testHashMap = new HashMap<>();
    
    public void testHashMap() {
        
        testHashMap.put(new Key("Sandeep"), "Sandeep kumar");
        testHashMap.put(new Key("Hareesh"), "Hareesh Kumar");
        System.err.println("Value 1:" + testHashMap.get(new Key("Sandeep")));
        testHashMap.put(new Key("Sumesh"), "Sumesh kumar");
        System.err.println("Value 2:" + testHashMap.get(new Key("Sandeep")));
        System.err.println("Value 3:" + testHashMap.get(new Key("Sumesh")));
    }
    
}
