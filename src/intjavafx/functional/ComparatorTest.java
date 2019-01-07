/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjavafx.functional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author sandeepkumar
 */
public class ComparatorTest {
    
    public static void main(String[] args) {
        new ComparatorTest().test();
    }
    
    public void test() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(22, "Kavitha"));
        list.add(new Employee(32, "Sandeep"));
        list.add(new Employee(28, "Geo"));
        list.add(new Employee(30, "Gipson"));
        
        Collections.sort(list);
        System.err.println("Sorted based on name");
        list.stream().forEach(System.out::println);
        
//        Comparator<Employee> comparator = (e1,e2) -> { return e1.age - e2.age; };
        Collections.sort(list, (e1,e2) -> { return e1.age - e2.age; });
        
        System.err.println("Sorted based on age");
        list.stream().forEach(System.out::println);
        
        
    }
    
}
