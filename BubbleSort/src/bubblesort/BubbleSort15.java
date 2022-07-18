/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 * Nawaal Fatima
 * 26th October,2017.
 * BubbleSort15.java
 * Program that sorts and prints 15 random numbers.
 * @author fatin9973
 */
public class BubbleSort15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nums[]=new int[15];
        System.out.println("The 15 random numbers are-");
        for(int i=0;i<15;i++)
        {
            nums[i]=(int)((Math.random()*100)+1);
            System.out.println(nums[i]);
        }
        System.out.println("The 15 random numbers in ascending order are-");
        for(int count=14;count>0;count--)
        {
            for(int i=0;i<count;i++)
            {
                if(nums[i]>nums[i+1])
                {
                    int temp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                }
            }
        }
         for(int k=0;k<15;k++)
        {
            System.out.println(nums[k]);
        }
    }
}
