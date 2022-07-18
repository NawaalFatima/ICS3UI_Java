/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 * Nawaal Fatima
 * 26th October,2017.
 * BubbleSortDescending.java
 * Program that sorts numbers from largest to smallest.
 * @author fatin9973
 */
public class BubbleSortDescending {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nums[]=new int[10];
        System.out.println("The 10 random numbers are-");
        for(int i=0;i<10;i++)
        {
            nums[i]=(int)((Math.random()*100)+1);
            System.out.println(nums[i]);

        }
        System.out.println("The 10 numbers in descending order are-");
        for(int count=9;count>0;count--)
        {
            for(int i=0;i<count;i++)
            {
                if(nums[i+1]>nums[i])
                {
                    int temp=nums[i+1];
                    nums[i+1]=nums[i];
                    nums[i]=temp;
            }
        }
    }
        for(int k=0;k<10;k++)
        {
            System.out.println(nums[k]);
        }
        
    }
    
}
