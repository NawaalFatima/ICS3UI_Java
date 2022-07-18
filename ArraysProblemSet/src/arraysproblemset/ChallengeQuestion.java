/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysproblemset;

/**
 * Nawaal Fatima
 * 20th October,2017 
 * ChallengeQuestion.java 
 * Program used to open and close 100 lockers and then print out which locker is open.
 * @author fatin9973
 */
public class ChallengeQuestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int locker[] = new int[101];
        for (int i = 1; i < 101; i++)
        {
            locker[i] = 0;
        }
        for (int i = 2; i <= 100; i++)
        {
            for (int j = 1; i * j <= 100; j++)
            {
                locker[i * j] = (locker[i * j] == 0) ? 1 : 0;
            }
        }
        for (int i = 0; i < 101; i++) 
        {
            if (locker[i] == 0)
            {

                System.out.println("The locker " + i + " is open.");
            }
        }

    }         // im finally done with this program! :)
}
