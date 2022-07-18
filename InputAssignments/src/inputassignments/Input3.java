/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inputassignments;

/**
 * Nawaal Fatima
 * September 15,2017
 * printing the name and average of user, by inputing the user's name and their 4 first semester marks
 * Input3.java
 * @author fatin9973
 */
import java.util.Scanner;
public class Input3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String name;
        double mark1,mark2,mark3,mark4,total,average;
        System.out.println("Please enter your name");
        name=scan.next();
        System.out.println("Please enter your first subject marks for semester 1");
        mark1=scan.nextDouble();
        System.out.println("Please enter your second subject marks for semester 1");
        mark2=scan.nextDouble();
        System.out.println("Please enter your third subject marks for semester 1");
        mark3=scan.nextDouble();
        System.out.println("Please enter your fourth subject marks for semester 1");
        mark4=scan.nextDouble();
        total=mark1+mark2+mark3+mark4;
        average=total/4;
        System.out.println(name+"  your average is  "+average+"%");



        
        
        
    }
}
