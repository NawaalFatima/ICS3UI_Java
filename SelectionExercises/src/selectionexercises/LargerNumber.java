/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionexercises;

/**
 * Nawaal Fatima
 * 26th September,2017
 * LargerNumber.java
 * a program that reads in two numbers and outputs which one is larger.
 * @author fatin9973
 */
import java.util.Scanner;
public class LargerNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number1,number2;
        System.out.println("Enter two numbers");
        number1=scan.nextInt();
        number2=scan.nextInt();
        if(number1>number2)
        {
            System.out.println("The first number "+number1+"  is larger");
        }
        else
        {
            System.out.println("The second number "+number2+ "   is larger");
            
        }
    }
}
