/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewtest.hashing;

/**
 *
 * @author sandeep
 */
public class Key {

    String key;

    Key(String key) {
        this.key = key;
    }

    @Override
    public int hashCode() {
        return (int) key.charAt(0);
    }
    
    

//    @Override
//    public boolean equals(Object obj) {
//        Key object = (Key) obj;
//        return key.equals(object.key);
//    }
}
