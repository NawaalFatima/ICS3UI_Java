/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package canadiancomputingcompetition2012;

/**
 * Nawaal Fatima
 * September 29,2017
 * IronScaling.java
 * Program used to print the larger image of an icon.
 * @author fatin9973
 */
import java.util.Scanner;
public class IronScaling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int k;
        System.out.println("Enter an integer");
        k=scan.nextInt();
      
        for(int i=1;i<=k;i++)
        {
          for(int a=1;a<=(3*k)-k;a++)
          {
              System.out.print("*");
              if(a==k)
              {
                  for(int b=1;b<=a;b++)
                  {
                  System.out.print("X");
                  
                  }
              }
              
          }
          System.out.println();
        }
        
        for(int j=1;j<=k;j++)
        {
            for(int c=1;c<=k+2;c++)
            {
        
            System.out.print(" ");
            if(c==k)
            {
                for(int d=1;d<=c+k;d++)
                    System.out.print("X");
            }
            }
            System.out.println();
        }
        
        for(int h=1;h<=k;h++)
                {
                    for(int e=1;e<=k*2;e++)
                    {
                    System.out.print("*");
                    
                    if(e==k)
                    {
                        for(int f=1;f<=k;f++)
                        {
                            System.out.print(" ");
                            
                        if(f>=k*2&& f<=k*3)
                        {
                            System.out.print("*");
                               
                        }
                             
                        }
                        
                       
                }    
    }
                      System.out.println();
                      
    }
        
    }
    }




