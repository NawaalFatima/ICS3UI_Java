/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package whileloopexercise;

/**
 * Nawaal Fatima
 * 2nd October,2017.
 * Question6.java
 * program that asks the user to enter a username and password. If incorrect,prompt the user to try again, and if correct, give a “Correct!” message. (The only correct combination is username=”BOB” and password=123.)
 * @author fatin9973
 */
import java.util.Scanner;
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String userName;
        int password;
        System.out.println("Please enter the username.");
        userName=scan.next();
        System.out.println("Please enter the password");
        password=scan.nextInt();
        while(!userName.equals("BOB")||password!=123)
        {
            System.out.println("Please enter a new username"); 
            userName=scan.next();
            System.out.println("PLease enter a new password");
            password=scan.nextInt();
            
        }
        System.out.println("Correct!");
        
        
        
    }
}
