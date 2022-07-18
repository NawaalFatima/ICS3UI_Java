/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package makingmethods;

/**
 * Nawaal Fatima
 * 7th November,2017
 * Question2.java
 * Program used to accept and print name for specified number of times.
 * @author fatin9973
 */
import java.util.Scanner;
public class Question2 {

    public static void Accept(String name,int number)
    {
       for(int i=1;i<=number;i++)
       {
           System.out.print(name);
       }
    }
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("Please enter a name and the number of times you want to print it");
       String n=scan.nextLine();
       int num=scan.nextInt();
       Accept(n,num);
       
    }
}
