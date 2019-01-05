/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjavafx.datastructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author sandeepkumar
 */
public class CollectionTest {
    
    
    public static void main(String[] args) {
        
    }
    
    public void test() {
        
        List<SuperParent> superParent = new ArrayList<>();
        List<Person> persons = new ArrayList<>();
        List<Child> childs = new ArrayList<>();
        
        method1(persons);
        method1(childs);
//        method1(superParent);compilation error this wont accept
        
        method2(persons);
//        method2(childs); // Compilation error  this wont accept
        method2(superParent);
        
        
    }
    
    public void method1(Collection<? extends Person> list) {
        
    }
    
    public void method2(Collection<? super Person> list) {
        
    }
    
    
}
