/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionexercises;

/**
 * Nawaal Fatima
 * 26th September,2017
 * RandomGuess.java
 * program that chooses a random number between 1 and 100, then gives the user two chances to guess the number. It then tells them what the number was and which guess was closer. 
 * @author fatin9973
 */
import java.util.Scanner;
public class RandomGuess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int randomNumber = (int)(Math.random()*100+1);
       int number1,number2,d1,d2;
       System.out.println("I have chosen a number between 1 and 100. Try to guess it! You have 2 chances to guess the number. Please enter them below.");
       number1=scan.nextInt();
       number2=scan.nextInt();
       d1=Math.abs(randomNumber-number1);
      d2=Math.abs(randomNumber-number2);
       System.out.println("The number was  "+randomNumber);
       if(d1>d2)
       {
           System.out.println("Your second guess was closer");
           
       }
       else
       {
           System.out.println("Your first guess was closer");
       }
       
    }
}
