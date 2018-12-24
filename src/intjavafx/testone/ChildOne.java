/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewtest.testone;

import interviewtest.annotation.MethodInfo;
import java.util.Comparator;

/**
 *
 * @author sandeep
 */
public class ChildOne extends Parent implements Cloneable, Comparable<ChildOne>, Comparator<ChildOne> {

    public String childName = "Child";

    public static int i = 0;

    static {
        i = 10;
        System.out.println("static block called :" + i);
    }

    public class InnerClass {

        int a;
        static final int d = 0;

    }

    public ChildOne(String name) {
        this.childName = name;
    }
    
     @Override
    public Object clone() 
    throws CloneNotSupportedException 
    { 
        return super.clone(); 
    } 

    @Override
    @MethodInfo(author = "Pankaj", comments = "Main method", date = "Nov 17 2012", revision = 1)
    public void sayName() {
        System.out.println("I am " + childName);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Finalise called for ChildOne");
    }

    @MethodInfo(author = "Pankaj", comments = "Main method", date = "Nov 17 2012", revision = 1)
    public void sayNameTest() {
        super.sayName();
        System.out.println("I am " + childName);
    }

    @Override
    public int compareTo(ChildOne o) {
        return childName.compareTo(o.childName);
    }

    @Override
    public int compare(ChildOne o1, ChildOne o2) {
        return o1.compareTo(o2);
    }

    public String toString() {
        System.out.println("Test toString called");
        return "";
    }

}
