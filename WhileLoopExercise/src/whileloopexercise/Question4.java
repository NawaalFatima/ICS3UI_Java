/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package whileloopexercise;

/**
 * Nawaal Fatima
 * 2nd October,2017
 * Question4.java
 * program that reads in numbers from the user until a negative number is entered, then prints out the average of the numbers.
 * @author fatin9973
 */
import java.util.Scanner;
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number; 
        int count=0;
        double total=0;
         double average=0;
         System.out.println("Please enter the number");
         number=scan.nextInt();
         while(number>=0)
         {
               
               count=count+1;
                total=total+number;
                System.out.println("Please enter the number");
                number=scan.nextInt();
                 
         }
         
       
               average=total/count;
          System.out.println("The average of entered numbers is  "+average);
}
}


