package graphbasics;

import java.awt.*;
import javax.swing.*;

public class BasicsPanel extends JPanel {
    public BasicsPanel(){
        setBackground(Color.white);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.green);
        int[]x = {75,150,120};
        int[]y = {75,140,50};
        g.fillPolygon(x,y,3);
        g.setColor(Color.white);
        g.fillRect(0,0,100,100);
        }
}
