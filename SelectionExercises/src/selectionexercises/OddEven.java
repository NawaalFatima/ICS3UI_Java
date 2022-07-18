/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionexercises;

/**
 * Nawaal Fatima
 * 26th September,2017
 * OddEven.java
 * program that reads a number from the user and tells them if the number was even or odd.
 * @author fatin9973
 */
import java.util.Scanner;
public class OddEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number;
        System.out.println("Enter a number");
        number=scan.nextInt();
        if(number%2==0)
        {
            System.out.println(number+"  is an even number.");
        }
        else
        {
            System.out.println(number+"  is a odd number ");
            
        }
    }
}
