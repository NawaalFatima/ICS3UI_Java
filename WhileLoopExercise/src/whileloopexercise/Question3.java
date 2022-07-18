/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package whileloopexercise;

/**
 * Nawaal Fatima
 * 2nd October,2017
 * Question3.java
 * program that reads in numbers from the user until a negative number is entered, then prints out the sum of the numbers.
 * @author fatin9973
 */
import java.util.Scanner;
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=0;
        int total=0;
      
        while(number>=0)
        {
            System.out.println("Please enter the number.");
            number=scan.nextInt();
            if(number>=0)
            {
            total=total+number;
        }
        }   
        System.out.println("The sum of entered numbers is  "+total);
    }
}
