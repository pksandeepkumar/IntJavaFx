/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjavafx.predicatetest;

import java.util.function.Predicate;

/**
 *
 * @author sandeep
 */
public class PredicateTest {

    public void test1() {
        // Creating predicate 
        Predicate<Integer> lesserthan = i -> (i < 18);

        // Calling Predicate method 
        System.out.println(lesserthan.test(10));
        //output will be true
    }

    //Predicate and and negate
    public void test2() {
        Predicate<Integer> greaterThanTen = (i) -> i > 10;

        // Creating predicate 
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;
        boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
        System.out.println("greaterThanTen.and(lowerThanTwenty).test(15):" + result); // Output true

        // Calling Predicate method 
        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
        System.out.println("greaterThanTen.and(lowerThanTwenty).negate().test(15):" + result2); //Output false since negate 
    }

    //Predicate or
    public void test3() {
        Predicate<String> containsLetterA = p -> p.contains("A");
        String containsA = "And";

        Predicate<String> hasLengthOf10 = new Predicate<String>() {
            @Override
            public boolean test(String t) {
                return t.length() > 10;
            }
        };

        boolean outcome = hasLengthOf10.or(containsLetterA).test(containsA);

        System.out.println(outcome);
    }
}
