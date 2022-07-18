/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionexercises;

/**
 * Nawaal Fatima
 * 26th September,2017
 * TicketBuyer.java
 * program that asks the user for their age and then either accepts or rejects them for buying a ticket to a rated R movie (you must be 18 to go see a restricted movie)
 * @author fatin9973
 */
import java.util.Scanner;
public class TicketBuyer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int age;
        System.out.println("Please enter your age");
        age=scan.nextInt();
        if(age<18)
        {
            System.out.println("You may not buy a ticket");
        }
        else if(age>=18)
        {
            System.out.println("You may buy a ticket");
        }
    }
}
