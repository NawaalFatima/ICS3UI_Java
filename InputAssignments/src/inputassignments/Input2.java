package inputassignments;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Nawaal Fatima
 * September 15,2017
 * printing the current age of the user, by asking for the user's year of birth.
 * Input2.java
 * @author fatin9973
 */
import java.util.Scanner;
public class Input2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double yearOfBirth,currentAge;
        final double CURRENT_YEAR=2017;
        System.out.println("Please enter your year of birth");
        yearOfBirth=scan.nextDouble();
        currentAge=CURRENT_YEAR-yearOfBirth;
        System.out.println("Your current age is =  "+currentAge);
        
    }
}
