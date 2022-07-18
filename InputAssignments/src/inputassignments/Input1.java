/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inputassignments;

/**
 * Nawaal Fatima
 * September 14,2017
 * Input1.java
 * calculate the perimeter of triangle by initializing three sides of triangle.
 * @author fatin9973
 */
import java.util.Scanner;
public class Input1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double length,width,height;
        System.out.println("Please enter the lenth, width and height of the box, one by one.");
        length=scan.nextDouble();
        width=scan.nextDouble();
        height=scan.nextDouble();
        double volume=length*width*height;
        System.out.println("The volume of the box is " +volume+ "  cm.");
                
        
    }
}
