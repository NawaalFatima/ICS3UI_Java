
package forlooptableexample;

/**
 * Nawaal Fatima
 * 21st September,2017
 * Question2.java
 * You’ve been hired to clean pools for the month of July. You have to work every day (31
    days) but your boss has agreed to pay you $0.01 on the 1 st , $0.02 on the 2 nd , $0.04 on
     the 3 rd and so on, so that each day you make twice what you made the day before.
     Make a table (lined up as best you can), showing the date, your pay for that day, and
       your total pay up to and including that day.
 * @author fatin9973
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int i=1;
        double dailyPay=0.01;
        double totalPay=0.01;
        for(;i<=31;i++,dailyPay=dailyPay*2,totalPay=totalPay+dailyPay)
           
        {
            System.out.println(i+"           "+dailyPay+"          "+totalPay);
        }
    }
}




    

            
            
        
            
            
