/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package makingmethods;

/**
 * Nawaal Fatima
 * 7th November,2017
 * Question3.java
 * Program used to
 * @author fatin9973
 */
public class Question3 
{
    public static double Maximum(double num1,double num2,double num3)
    {
        double compare=0;
        double max=0;
        compare=Math.max(num1, num2);
        max=Math.max(compare,num3);
         return max;
        
    }
    public static void main(String args[])
    {
        double randomNumber1=(double)((Math.random()*100)+1);
        double randomNumber2=(double)((Math.random()*100)+1);
        double randomNumber3=(double)((Math.random()*100)+1);
        System.out.println("Three random numbers are-");
        System.out.println(randomNumber1);
        System.out.println(randomNumber2);
        System.out.println(randomNumber3);
        double myMax=Maximum(randomNumber1,randomNumber2,randomNumber3); 
        System.out.println("The largest number is "+myMax);
        
}
}

    
   
