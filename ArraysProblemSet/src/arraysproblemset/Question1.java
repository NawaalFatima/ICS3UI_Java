/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysproblemset;

/**
 * Nawaal Fatima
 * 20th October,2017
 * Question1.java
 * Program using a counted loop to print out 5 names in order, one per line.
 * @author fatin9973
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name[]=new String[5];
        name[0]="Amy";
        name[1]="Hannah";
        name[2]="David";
        name[3]="Rebecca";
        name[4]="Mark";
        for(int i=0;i<5;i++)
        {
            System.out.println(name[i]);
        }
        
    }
}
