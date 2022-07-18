/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package makingmethods;

/**
 * Nawaal Fatima
 * 7th November,2017
 * Question1.java
 * Program used to calculate and return values of a box.
 * @author fatin9973
 */
public class Question1 {

    public static double VolumeBox(double length,double width,double height)
    {
        double volume=length*width*height;
        return volume;
    }
    public static void main(String[] args) {
        double l=5.67;
        double w=1.23;
        double h=7.89;
        double myVolume = VolumeBox(l,w,h);
        System.out.println("The volume of a box is "+ myVolume);
                
    }
}
