/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjavafx.diamond;

/**
 *
 * @author sandeepkumar
 */
public interface Parent2 {
    default public void method() {
        System.err.println("Parent2...");
    }
}
