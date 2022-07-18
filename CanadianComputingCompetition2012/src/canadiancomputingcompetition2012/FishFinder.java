/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package canadiancomputingcompetition2012;

/**
 * Nawaal Fatima
 * September 29,2017
 * FishFinder.java
 * Program used to find whether there are fish based on the depth.
 * @author fatin9973
 */
import java.util.Scanner;
public class FishFinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int depth1,depth2,depth3,depth4;
        System.out.println("Enter the depth readings");
        depth1=scan.nextInt();
        depth2=scan.nextInt();
        depth3=scan.nextInt();
        depth4=scan.nextInt();
        if(depth1<=depth2&&depth2<=depth3&&depth3<=depth4&&depth4>=depth1)
        {
            System.out.println("Fish Rising");
        }
        else if(depth1>=depth2&&depth2>=depth3&&depth3>=4&&depth4<=depth1)
        {
            System.out.println("Fish Diving");
        }
        else if(depth1==depth2&&depth2==depth3&&depth3==depth4&&depth4==depth1)
        {
            System.out.println("Fish At Constant Depth");
        }
        else
        {
            System.out.println("No Fish");
        }
    }
}
