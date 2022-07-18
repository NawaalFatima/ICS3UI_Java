package inputexamples;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Nawaal Fatima
 * September 15,2017
 * printing the product of an integer and a double, which was given by user.
 * WorkingWithNumbers.java
 * @author fatin9973
 */
import java.util.Scanner;
public class WorkingWithNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number1;
        double number2, product;
        System.out.println("Please enter an integer ");
        number1=scan.nextInt();
        System.out.println("Please enter a double");
        number2=scan.nextDouble();
        product=number1*number2;
        System.out.println("The product of integer and double is  =  "+product);
    }
}
