/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 * Nawaal Fatima
 * 26th October,2017.
 * BubbleStrings.java
 * Program that reads and sorts 10 strings.
 * @author fatin9973
 */
import java.util.Scanner;
public class BubbleStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word[]=new String[10];
        System.out.println("Please enter 10 words-");
        for(int i=0;i<10;i++)
        {
            word[i]=scan.next();
        }
        for(int count=9;count>0;count--)
        {
            for(int i=0;i<count;i++)
            {
                if((word[i].compareToIgnoreCase(word[i+1]))>0)
                        {
                           String temp=word[i];
                           word[i]=word[i+1];
                           word[i+1]=temp;
                        }
                    
            }
        }
        System.out.println("The words in ascending order are-");
        for(int k=0;k<10;k++)
        {
            System.out.println(word[k]);
        }
    }
}