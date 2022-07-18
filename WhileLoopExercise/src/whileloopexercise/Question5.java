/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package whileloopexercise;

/**
 * Nawaal Fatima
 * 2nd October,2017
 * Question5.java
 * program that reads in numbers from the user until a negative number is entered,then prints out the largest number.
 * @author fatin9973
 */
import java.util.Scanner;
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number;
        int max=0;
        System.out.println("Please enter the number");
        number=scan.nextInt();
        while(number>0)
        {
            max=Math.max(number,max);
            System.out.println("Please enter the next number");
            number=scan.nextInt();
            
        }
        System.out.println("the maximum of the entered numbers are  "+max);
    }
}
