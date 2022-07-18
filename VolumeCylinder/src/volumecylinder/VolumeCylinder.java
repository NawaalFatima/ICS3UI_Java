/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package volumecylinder;

/**
 * Nawaal Fatima
 * 18th September,2017.
 * VolumeCylinder.java
 * Program used to calculate the volume of a given cylinder by asking the user to input the radius and the height.
 * @author fatin9973
 */
import java.util.Scanner;
public class VolumeCylinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    double radius,height,volume;
    final double PI=3.14159;
    System.out.println("Please enter the radius");
    radius=scan.nextDouble();
    System.out.println("Please enter the height");
    height=scan.nextDouble();
    volume=PI*radius*radius*height;
    System.out.println("The volume of the cylinder is  "+volume+" cubic cm.");
    
    
    
    }
}
