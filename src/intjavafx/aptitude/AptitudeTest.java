/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjavafx.aptitude;

/**
 *
 * @author sandeep
 */
public class AptitudeTest {
    
    public static void main(String[] args) {
        System.err.println("Count:" + new AptitudeTest().getCont("carhskkcarjksfcarkjksdcarlkl","car" ));
    }
    
    public void test1() {

        int x = 100;
        double y = 100.1;
        boolean b = (x == y); /* Line 7 */
        System.out.println(b);

    }
    
    //Find nmber of occurance in a string with substring
    public int getCont(String str, String sub) {
        int count =0;
        for( int i =0, j =0; i < str.length(); i++) {
            
            if(str.charAt(i) != sub.charAt(j)) {
                j = 0;
            } else {
                j++;
            }
            
            
            if( j == sub.length()) {
                count++;
                j = 0;
            }
        } 
        return count;
    }
    
}
