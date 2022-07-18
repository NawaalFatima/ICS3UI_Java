
package inputexamples;

/**
 *Nawaal Fatima
 * September 14,2017
 * InputReader.java
 * Print the number and a name which was given by the user
 * @author fatin9973
 */
import java.util.Scanner;
public class InputReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number1;
        System.out.println("Please enter a number");
        number1=scan.nextInt();
        System.out.println(number1);
        String userName;
        System.out.println("Please enter a name");
        userName=scan.next();
        System.out.println(userName);
    }
}
