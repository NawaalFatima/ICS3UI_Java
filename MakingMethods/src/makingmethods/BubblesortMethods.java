/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package makingmethods;

/**
 * Nawaal Fatima
 * 15th November,2017
 * BubblesortMethods.java
 * Program that is used to pass arrays to methods in order to perform various actions in a menu.
 * @author fatin9973
 */
import java.util.Scanner;
public class BubblesortMethods {
    public static int[] Random(int[] num)
    {
        for(int i=0;i<100;i++)
        {
            num[i]=(int)((Math.random()*100)+1);
        }
    return num;
    }
    public static void Print(int[] num2)
    {
        for(int i=0;i<100;i++)
        {
            System.out.println(num2[i]);
        }
    }
    public static int[]Ascending(int[] num3)
    {
        for(int count=99;count>0;count--)
        {
            for(int i=0;i<count;i++)
                {
                    if(num3[i+1]<num3[i])
                    {
                        int temp=num3[i+1];
                        num3[i+1]=num3[i];
                        num3[i]=temp;
                                
                    }
                    
                  }
            
          }
            return num3;
     }
    public static int[]Descending(int[] num4)
    {
        for(int count=99;count>0;count--)
        {
            for(int i=0;i<count;i++)
            {
                if(num4[i+1]>num4[i])
                {
                   int temp=num4[i+1];
                        num4[i+1]=num4[i];
                        num4[i]=temp;
                                 
                }
            }
        }
            return num4;
     } 
    public static void main(String[] args) {
        int numbers[]=new int[100];
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your choice(either 1,2,3,4, or 5)");
        System.out.println("1.Generate 100 random numbers for the arrray.");
        System.out.println("2.Print the array.");
        System.out.println("3.Bubblesort the array in ascending order.");
        System.out.println("4.Bubblesort the array into descending order.");
        System.out.println("5.Quit the program.");
        int choice=scan.nextInt();
        while(choice!=5)
        {
            if(choice==1)
            {
                numbers=Random(numbers);
                System.out.println("100 random numbers have been generated.Please enter another choice or press 5 to quit program.");
                choice=scan.nextInt();          
            }
            if(choice==2)
            {
                System.out.println("The numbers are-");
                Print(numbers);
                System.out.println("Please enter another choice or press 5 to quit program.");
                choice=scan.nextInt();          
            }
            if(choice==3)
            {
                numbers=Ascending(numbers);
                System.out.println("Press 6 to print the array in ascending order or enter another choice.Press 5 to quit program.");
                choice=scan.nextInt(); 
                if(choice==6)
                {
                    System.out.println("The 100 random numbers in ascending order are-");
                    Print(numbers);
                    System.out.println("Please enter another choice or press 5 to quit program.");
                    choice=scan.nextInt(); 
                    
                }
                
            }
            if(choice==4)
            {
               numbers=Descending(numbers);
                System.out.println("Press 6 to print the array in descending order or enter another choice.Press 5 to quit program.");
                choice=scan.nextInt(); 
                if(choice==6)
                {
                    System.out.println("The 100 random numbers in descending order are-");
                    Print(numbers);
                    System.out.println("Please enter another choice or press 5 to quit program.");
                    choice=scan.nextInt(); 
                   
                }      
            }
            
        }
    }
}
