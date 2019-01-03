/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjavafx.Optional;

import java.util.Optional;

/**
 *
 * @author sandeep
 */
public class OptionalTest  {

   public static void main(String args[]) {
      OptionalTest java8Tester = new OptionalTest();
      Integer value1 = null;
      Integer value2 = new Integer(10);
		
      //Optional.ofNullable - allows passed parameter to be null.
       Optional<Integer> a = Optional.ofNullable(value1);
		
      //Optional.of - throws NullPointerException if passed parameter is null
      Optional<Integer> b = Optional.ofNullable(null);
      System.out.println(java8Tester.sum(a,b));
   }
	
   public Integer sum(Optional<Integer> a, Optional<Integer> b) {
      //Optional.isPresent - checks the value is present or not
		
      System.out.println("First parameter is present: " + a.isPresent());
      System.out.println("Second parameter is present: " + b.isPresent());
		
      //Optional.orElse - returns the value if present otherwise returns
      //the default value passed.
      Integer value1 = a.orElse(new Integer(0));
		
      //Optional.get - gets the value, value should be present if no value NoSuchElementException will return
      Integer value2 = b.get();
      return value1 + value2;
   }
}
