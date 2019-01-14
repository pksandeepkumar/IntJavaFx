/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjavafx.recursive;

/**
 *
 * @author sandeep
 */
public class RecursiveTest {
    
    public static void main(String[] args) {
        new RecursiveTest().test1();
    }
    
    public void test1() {
        System.err.println("Factorial:" + factorial(5));
        System.err.println("Sum of N:" + sumOfN(10));
    }
    
    public int factorial(int n) {
        if( n == 1) return 1;
        return n * factorial( n-1);
    }
    
    public int sumOfN( int n) {
        if( n == 1) return 1;
        return n + sumOfN( n-1);
    }
}
