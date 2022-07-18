/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysproblemset;

/**
 * Nawaal Fatima
 * 20th October,2017
 * Question4.java
 * Program using a Scanner class and a counted loop to read in the numbers from the keyboard and another counted loop to find the average interest rate then display it on the screen in a sentence.
 * @author fatin9973
 */
import java.util.Scanner;
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double interestRate[]=new double[8];
        double total=0.0;
        double average=0.0;
        System.out.println("Enter in 8 interest rates in decimals, one by one.");
        for(int i=0;i<8;i++)
        {
            interestRate[i]=scan.nextDouble();
            total=total+interestRate[i];  
        }
        average=total/8.0;
        System.out.println("The average of entered numbers are "+average);
    }
}
