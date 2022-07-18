/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionexercises;

/**
 * Nawaal Fatima
 * 26th September,2017
 * LargestNumber.java
 * a program that reads in three numbers and outputs which one is the largest.
 * @author fatin9973
 */
import java.util.Scanner;
public class LargestNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number1,number2,number3;
        System.out.println("Enter three numbers");
        number1=scan.nextInt();
        number2=scan.nextInt();
        number3=scan.nextInt();
        if(number1>number2&&number1>number3)
        {
            System.out.println("The first number "+number1+ "is the largest");
        }
        else if(number2>number1&&number2>number3)
        {
            System.out.println("The second number "+number2+" is the largest");
        
        }
        else
        {
            System.out.println("The third number  "+number3+" is the largest");
        }
    }
}
