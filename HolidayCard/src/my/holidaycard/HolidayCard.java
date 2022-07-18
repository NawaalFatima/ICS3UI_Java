
package my.holidaycard;

/**
 *
 * @author fatin9973
 */
import java.awt.*;
import javax.swing.*;

public class HolidayCard extends JPanel
{
    public static final double halfPI = Math.PI / 2; 
    public HolidayCard()
    {
        Color Blue=new Color(175,175,216);
         setBackground(Blue); 
    }
    
    public void paintComponent(Graphics g)
    {
        
        int x[] = {550, 1000, 0, 1500};
        int y[] = {0, 950, 900, 10};
        super.paintComponent(g);
        Color Tree=new Color(0,210,105);
        g.setColor(Tree);
        Graphics2D g3d = (Graphics2D) g.create();
        GradientPaint gp2 = new GradientPaint(550,1000,Tree,950,900,Color.black, true);
        g3d.setPaint(gp2);
        g3d.fillPolygon(x,y,3);
        g.setColor(Color.BLACK);
        g.drawPolygon(x,y,3);
        

        
        
        Color Bark=new Color(255,149,43);
        Graphics2D g2d = (Graphics2D) g.create();
        GradientPaint gp1 = new GradientPaint(410, 930,Bark, 160, 220, Color.black, true);
        g2d.setPaint(gp1);
        g2d.fillRect(410,930,160,220);
        g.setColor(Color.black);
        g.drawRect(410,930,160,220);
        
       
       

        Color Star=new Color(255,255,255);
        drawStar(g,Star,8,1300,100,20,20);
        drawStar(g,Star,6,2000,500,20,20);
        drawStar(g,Star,6, 100, 100, 20, 20);
        drawStar(g,Star,6,2400,100,20,20);
        drawStar(g,Star,7,1000,500,20,20);
        drawStar(g,Star,7,1500,800,20,20);
        drawStar(g,Star,8,850,200,20,20);
        drawStar(g,Star,8,200,400,30,30);
        drawStar(g,Star, 9, 2200, 750, 30, 30);
        drawStar(g,Star, 9, 1200,300,20,20);
        drawStar(g,Star, 9, 2200, 400, 40, 40);
        
       
        
        
        
        
            
        Color a=new Color(255,183,219);
        g.setColor(a);
        g.drawOval(500,150,50,50);
        g.fillOval(500,150,50,50);  
        g.drawOval(450,350,50,50);
        g.fillOval(450,350,50,50); 
        g.drawOval(750,500,50,50);
        g.fillOval(750,500,50,50);
        g.drawOval(580,670,50,50);
        g.fillOval(580,670,50,50); 
        g.drawOval(110,700,50,50);
        g.fillOval(110,700,50,50);  // 1 ornament color
        
        
        Color b= new Color(255,62,158);
        g.setColor(b);
        g.drawOval(600,200,50,50);
        g.fillOval(600,200,50,50);  
        g.drawOval(550,400,50,50);
        g.fillOval(550,400,50,50); 
        g.drawOval(250,500,50,50);
        g.fillOval(250,500,50,50); 
        g.drawOval(750,750,50,50);
        g.fillOval(750,750,50,50);
        g.drawOval(250,770,50,50);
        g.fillOval(250,770,50,50); //2 ornament color
       
        Color c= new Color(202,0,101);
         g.setColor(c);
        g.drawOval(350,300,50,50);
        g.fillOval(350, 300, 50, 50);  
        g.drawOval(650,450,50,50);
        g.fillOval(650,450,50,50);
        g.drawOval(400,590,50,50);
        g.fillOval(400, 590,50,50); 
        g.drawOval(890,820,50,50);
        g.fillOval(890,820,50,50);
        g.drawOval(400,850,50,50);
        g.fillOval(400,850,50,50);  //3 ornement color
       
        
        Color ombre=new Color(255,128,192);
        Color ombre1=new Color(0,128,255);
        Graphics2D g4d = (Graphics2D) g.create();
        GradientPaint gp3 = new GradientPaint(1000,1000,ombre,400,150,ombre1, true);
        g4d.setPaint(gp3);
        g4d.fillRoundRect(1000,1000,400,150,50,50);
        g.setColor(Color.BLACK);
        g.drawRoundRect(1000, 1000, 400, 150, 50, 50);
        Color ribbon = new Color(163,73,164);
        g.setColor(ribbon);
        g.drawLine(1200,1000,1200,1150);
        g.drawLine(1000,1075,1400,1075);

        
        
        
        
        
        Color ombre2=new Color(0,255,164);
        Color ombre3=new Color(64,64,128);
        Graphics2D g5d = (Graphics2D) g.create();
        GradientPaint gp4 = new GradientPaint(300,200,ombre2,800,900,ombre3, true);
        g5d.setPaint(gp4);
        g5d.fillRect(800, 900, 300, 200);
        g.setColor(Color.BLACK);
        g.drawRect(800, 900, 300, 200);
        g.draw3DRect(800,900,300,200,true);
        g.drawLine(950,900,950,1100);
        g.drawLine(1100,900,1000,1100);
        g.drawLine(800,900,900,1100);
        g.drawLine(950,900,800,1200);
        g.drawLine(950,900,1100,1100);
        
        
        
        
        Color ombre4=new Color(253,11,53);
        Color ombre5=new Color(0,0,0);
        Graphics2D g6d = (Graphics2D) g.create();
        GradientPaint gp5 = new GradientPaint(1000,550,ombre4,250,300,ombre5, true);
        g6d.setPaint(gp5);
        g6d.fillRoundRect(550,1000,300,250,30,40);
        g.setColor(Color.BLACK);
        g.drawRoundRect(550,1000,300,250,30,40);
        Color sash=new Color(0,72,36);
        g.setColor(sash);
        g.drawLine(600,1000,600,1250);
        g.drawLine(650,1000,650,1250);
        g.drawLine(700,1000,700,1250);
        g.drawLine(750,1000,750,1250);
        g.drawLine(800,1000,800,1250);
        
        
       
        
        
        Color ombre6=new Color(0,255,164);
        Color ombre7=new Color(64,64,128);
        Graphics2D g7d = (Graphics2D) g.create();
        GradientPaint gp6 = new GradientPaint(150,400,ombre6,1100,25,ombre7, true);
        g7d.setPaint(gp6);
        g7d.fillOval(25,1100,400,150);
        g.setColor(Color.BLACK);
        g.drawOval(25,1100,400,150);
        
        
        Font words = new Font("Lucida Bright", Font.PLAIN, 53);
        g.setColor(Color.black);
        g.setFont(words);
        g.drawString("Wishing  you  a  season  of ", 1400,300);
        Font words1 = new Font("Edwardian Script ITC", Font.PLAIN, 82);
        g.setFont(words1);
        g.drawString(" gladness", 1680,380);
        g.setFont(words);
        g.drawString(" a  season  of ", 1580,460);
        g.setFont(words1);
        g.drawString(" cheer", 1720,540);
        g.setFont(words);
        g.drawString("and  to  top  it  all  off-", 1480,620);
        Font words2 = new Font("Edwardian Script ITC", Font.PLAIN, 79);
        g.setFont(words2);
        g.drawString(" a  wonderful  year.", 1550,700);
        
        
        g.drawArc(1500,745,300,100,0,100);
        g.drawArc(1500,750,302,100,0,100);
        g.drawArc(1500,755,304,100,0,100);
        g.drawArc(1500,760,306,100,0,100);
        g.drawArc(1500,765,308,100,0,100);
        g.drawArc(1500,770,310,100,0,100);
        
        g.drawArc(1750,745,302,100,99,95);
        g.drawArc(1750,750,304,100,99,95);
        g.drawArc(1750,755,306,100,99,95);
        g.drawArc(1750,760,308,100,99,95);
        g.drawArc(1750,765,310,100,99,95);
        g.drawArc(1750,770,312,100,99,95);
        
        
        }
        
    public double circleX(int sides, int angle) {
    
        double coeff = (double) angle / (double) sides;
        return Math.cos(2 * coeff * Math.PI - halfPI);
    }

    public double circleY(int sides, int angle) {
        double coeff = (double) angle / (double) sides;
        return Math.sin(2 * coeff * Math.PI - halfPI);
    }

    public void drawStar(Graphics g, Color c, int sides, int x, int y, int w, int h) {
        Color colorSave = g.getColor();
        g.setColor(c);
        for (int i = 0; i < sides; i++) {
            int x1 = (int) (circleX(sides, i) * (double) (w)) + x;
            int y1 = (int) (circleY(sides, i) * (double) (h)) + y;
            int x2 = (int) (circleX(sides, (i + 2) % sides) * (double) (w)) + x;
            int y2 = (int) (circleY(sides, (i + 2) % sides) * (double) (h)) + y;
            g.drawLine(x1, y1, x2, y2);
            
            
         
        }
    }
    
}
    

