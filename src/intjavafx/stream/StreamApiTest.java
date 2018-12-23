/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjavafx.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;

/**
 *
 * @author sandeepkumar
 */
public class StreamApiTest {

    long startTime;

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

    public void start() {
        startTime = System.nanoTime();

    }

    public void end() {
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println((totalTime/1000));
    }

}
