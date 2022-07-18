/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package whileloopexercise;

/**
 * Nawaal Fatima
 * 2nd October,2017
 * Question2.java
 * program that counts down from 10 to -10, counting by 2s.
 * @author fatin9973
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number=10;
        while(number>=-10)
        {
            System.out.println(number);
            number=number-2;
        }
    }
}
