/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysproblemset;

/**
 * Nawaal Fatima
 * 20th October,2017
 * Question5.java
 * Program using a Math.random and a counted loop to populate the array with 15 random numbers from 1 to 100. Then by using another counted loop to find the largest and smallest numbers in the array in order to print them on the screen in a sentence.
 * @author fatin9973
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int randomNumber[]=new int[15];
        int max=0;
        for(int j=0;j<15;j++)
        {
            randomNumber[j]=(int)(Math.random()*100+1);
        }
         int min=randomNumber[0]; 
        System.out.println("The 15 random numbers are-");
        for(int i=0;i<15;i++)
        {
            System.out.println(randomNumber[i]);
        }
        for(int i=0;i<15;i++)
        {
         min=Math.min(min,randomNumber[i]);
         max=Math.max(max,randomNumber[i]);
        }
        System.out.println("The maximum number is "+max);
        System.out.println("The minimum number is  "+min);
    }
}
