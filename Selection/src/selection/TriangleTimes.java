/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package selection;

/**
 * Nawaal Fatima
 * 27th September,2017
 * the  program reads in three angles (in degrees), and prints the type of triangle.
 * @author fatin9973
 */
import java.util.Scanner;
public class TriangleTimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double angle1,angle2,angle3,angleTotal;
        System.out.println("Enter three angles of a triangle");
        angle1=scan.nextDouble();
        angle2=scan.nextDouble();
        angle3=scan.nextDouble();
        angleTotal=angle1+angle2+angle3;
        if(angleTotal==180)
        {
            if(angle1==60&&angle2==60&&angle3==60)
            {
                System.out.println("Equilateral Triangle.");
                
            }
            else if(angle1==angle2||angle2==angle1|| angle1==angle3||angle3==angle1|| angle3==angle2||angle2==angle3)
            {
                System.out.println("Isosceles Triangle");
            }
            else
            {
                System.out.println("Scalene Triangle");
            }
        }
        else
        {
            System.out.println("Error");
    }
    }
}
