/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysproblemset;

/**
 * Nawaal Fatima
 * 20th October,2017
 * Question3.java
 * Program using a Scanner class and a counted loop to read in the names from the keyboard and another counted loop to display the names on the screen.
 * @author fatin9973
 */
import java.util.Scanner;
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String name[]=new String[10];
        System.out.println("Please enter 10 names,one by one.");
        for(int i=0;i<10;i++)
        {
           name[i]=scan.next();
        }
        System.out.println("The entered names are-");
        for(int j=0;j<10;j++)
        {
            System.out.println(name[j]);
        }
            
            
    }
}
