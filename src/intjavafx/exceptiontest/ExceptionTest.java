/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjavafx.exceptiontest;

/**
 *
 * @author sandeep
 */
public class ExceptionTest {
    
    
    public void test() {
        function1();
    }
    
    public void function1() {
        
        function2();
        System.err.println("function1()");
        
    }
    
    public void function2() {
        try {
            function3();
            System.err.println(" function 2() try block");
        } catch( ArithmeticException e) {
            System.err.println("Catch function 2()");
        } finally {
            System.err.println(" function 2() finally"); //This finally will be always
//            excecute wether we catch exception or not, if we do not catch the finaly block will execute 
// and application exits
        }
        System.err.println("End of try");
    }
    
    public void function3() {
        throw new NullPointerException();
//        throw new ArithmeticException();
    }
    
}
