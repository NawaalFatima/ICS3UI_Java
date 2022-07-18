
package my.holidaycard;

import javax.swing.JFrame;

/**
 *
 * @author fatin9973
 */
    public class HolidayCardBasics {
    public static void main(String[] args) {
        JFrame window = new JFrame("Holiday Card");
        HolidayCard content = new HolidayCard();
        window.setContentPane(content);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(1200,1200);
        window.setSize(1000,1000);
        window.setVisible(true);
    }
    
}





