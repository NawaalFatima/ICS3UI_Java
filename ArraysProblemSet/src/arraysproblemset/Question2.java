/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysproblemset;

/**
 * Nawaal Fatima
 * 20th October,2017
 * Question2.java
 * Program using a counted loop to print out the marks in reverse order, all on the same line and separated with commas.
 * @author fatin9973
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int marks[]=new int[5];
        marks[0]=34;
        marks[1]=56;
        marks[2]=67;
        marks[3]=89;
        marks[4]=100;
        for(int i=4;i>=0;i--)
        {
            System.out.print(marks[i]+" , ");
        }
        
    }
}
