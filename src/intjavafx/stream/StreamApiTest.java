/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjavafx.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.stream.Collectors;

/**
 *
 * @author sandeepkumar
 */
public class StreamApiTest {

    long startTime;

    //Here stream takes more time to execute
    public void test() {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(10);
        list.add(11);
        list.add(11);
        list.add(1);
        list.add(10);
        list.add(10);
        list.add(11);
        list.add(11);
        list.add(1);
        list.add(10);
        list.add(10);
        list.add(11);
        list.add(11);
        list.add(1);
        list.add(10);
        list.add(10);
        list.add(11);
        list.add(11);
        list.add(1);

        start();
        System.out.println("sumStream():" + sumStream(list));
        end();

        start();
        System.out.println("sumIterator():" + sumIterator(list));
        end();

        start();
        System.out.println("soutAll():");
        soutAll(list);
        end();
        
        start();
        System.out.println("soutAllWithLimit():");
        soutAllWithLimit(list);
        end();

        start();
        System.out.println("soutAllOdd():");
        soutAllOdd(list);
        end();
        
         start();
        System.out.println("sort():");
        sort(list);
        end();
        
        start();
        System.out.println("findSquire():");
        findSquire(list);
        end();
        
        start();
        System.out.println("findSquireParallel():");
        findSquireParallel(list);
        end();
        
        
        
        

    }

    private static int sumIterator(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int sum = 0;
        while (it.hasNext()) {
            int num = it.next();
            if (num > 10) {
                sum += num;
            }
        }
        return sum;
    }

    private static int sumStream(List<Integer> list) {
        return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
    }

    private void soutAll(List<Integer> list) {
        list.stream().forEach(System.out::println);
    }
    
    private void soutAllWithLimit(List<Integer> list) {
        list.stream().limit(5).forEach(System.out::println);
    }

    private void soutAllOdd(List<Integer> list) {
        list.stream().filter(i -> i % 2 == 1).forEach(System.out::println);
    }

    public void start() {
        startTime = System.nanoTime();

    }
    
    private void sort(List<Integer> list) {
        list.stream().sorted().forEach(System.out::println);
    }
    
    
    private void findSquire(List<Integer> list) {
        List square = list.stream().map(x->x*x).collect(Collectors.toList());
        square.forEach(System.out::println);
    }
    
    private void findSquireParallel(List<Integer> list) {
        List square = list.parallelStream().map(x->x*x).collect(Collectors.toList());
        square.forEach(System.out::println);
    }
    
    
    

    public void end() {
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println((totalTime / 1000));
    }

}
