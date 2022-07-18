/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package variablesproject;

/**
 * Nawaal Fatima
 * 25 September,2017
 * AreaSphere.java
 * To find the surface area of a sphere by asking the user to input the radius
 * @author fatin9973
 */
import java.util.Scanner;
public class AreaSphere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radius,surfaceArea;
        final double PI=3.14159;
        System.out.println("Please enter the radius");
        radius=scan.nextDouble();
        surfaceArea=4*PI*radius*radius;
        System.out.println("The surface area of the sphere is" + "  " +surfaceArea+"  square cm.");
        
        
    }
}
