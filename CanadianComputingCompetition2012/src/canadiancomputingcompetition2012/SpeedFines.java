/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package canadiancomputingcompetition2012;

/**
 * Nawaal Fatima
 * September 29,2017
 * SpeedFines.java
 * Program used to check speed and issue a fine if speed is over-limit.
 * @author fatin9973
 */
import java.util.Scanner;
public class SpeedFines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int speedLimit,recordedSpeed,d1;
        System.out.println("Enter the speed limit.");
        speedLimit=scan.nextInt();
        System.out.println("Enter the recorded speed of the car.");
        recordedSpeed=scan.nextInt();
        d1=recordedSpeed-speedLimit;
        if(recordedSpeed==speedLimit||recordedSpeed<=speedLimit)
        {
            System.out.println("Congratulations, you are within the speed limit!");
        }
        else 
        {
            if(d1>=1&&d1<=20)
            {
                System.out.println("You are speeding and your fine is $100.");
            }
            else if(d1>=21&&d1<=30)
            {
                System.out.println("You are speeding and the fine is $270.");
            }
            else if(d1>=31)
            {
                System.out.println("You are speeding and the fine is $500.");
            }
        }
    }
}
