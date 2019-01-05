/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjavafx.datastructure;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author sandeepkumar
 */
public class DatastructureTest {
    
    class CustomObject {
        String name;
        int age;

        public CustomObject(String name, int age) {
            this.name = name;
            this.age = age;
        }

        

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final CustomObject other = (CustomObject) obj;
            if (this.age != other.age) {
                return false;
            }
            if (!Objects.equals(this.name, other.name)) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 71 * hash + Objects.hashCode(this.name);
            hash = 71 * hash + this.age;
            return hash;
        }
        
        

        @Override
        public String toString() {
            return "CustomObject{" + "name=" + name + ", age=" + age + '}';
        }
        
    }

    public static void main(String[] args) {

        new DatastructureTest().test();

    }

    public void test() {

//        Set
        Set<String> setA = new HashSet();
        setA.add("Sandeep");
        setA.add("Geo");
        setA.add("Gipson");
        setA.add("Sandeep");
        setA.add("Kavitha");

//          setA.stream().forEach(System.out::println);
        /*
          Ooutput
          Geo
Gipson
Sandeep
Kavitha
         */
        System.err.println("Set B");
        Set<String> setB = new LinkedHashSet<>(); //This keeps order of insertion
        setB.add("Sandeep");
        setB.add("Geo");
        setB.add("Gipson");
        setB.add("Sandeep");
        setB.add("Kavitha");
//        setB.stream().forEach(System.out::println);
        /*
          Output
          Sandeep
Geo
Gipson
Kavitha
         */
        
        Set<CustomObject> setC = new HashSet();
        setC.add(new CustomObject("Sandeep",1));
        setC.add(new CustomObject("Geo",1));
        setC.add(new CustomObject("Gipson",1));
        setC.add(new CustomObject("Sandeep",1));
        setC.add(new CustomObject("Kavitha",1));
        setC.stream().forEach(System.out::println);

    }

}
