package graphbasics;

import javax.swing.JFrame;

public class GraphBasics {

    public static void main(String[] args) {
        JFrame window = new JFrame("Graphics Basics");
        BasicsPanel content = new BasicsPanel();
        window.setContentPane(content);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(120, 70);
        window.setSize(400,400);
        window.setVisible(true);
    }
}
