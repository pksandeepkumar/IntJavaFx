/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjavafx.functional;

/**
 *
 * @author sandeepkumar
 */
public class Employee implements Comparable<Employee>{
    
    int age;
    String name;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Employee{" + "age=" + age + ", name=" + name + '}';
    }
    
    
    
    
    
}
