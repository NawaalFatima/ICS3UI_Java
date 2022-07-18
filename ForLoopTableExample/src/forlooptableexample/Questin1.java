
package forlooptableexample;

/**
 * Nawaal Fatima
 * 21st September,2017
 * Question1.java
 * Create the table of values corresponding to the equation y = -3x 2 - 4, for integer values
   in the domain from x = -5 to x = 5.
 * @author fatin9973
 */
public class Questin1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        for(int x=-5;x<=5;x++)
        {
            int y=(-3*x*x)-4;
        
            System.out.println(x+"                   "+y);
                    }  
    }
}
