package ProgrammingProjects.OpticalIllusions;

import javax.swing.*;
import java.awt.*;

public class CafeWall extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(150, 150, 150));
        for(int i = 0; i < 400; i += 30) {
            g.fillRect(0, i, 830, 3);
        }
        g.setColor(new Color(0, 0, 0));
        int x_dif = 5;
        for(int y = 3; y < 395; y += 30) {
            if (x_dif == 5) {x_dif = -5;}
            else if (x_dif == -5) {x_dif = 5;}
            for (int x = 30; x < 800; x += 50) {
                g.fillRect(x+x_dif, y, 20, 27);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CafeWall");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.setSize(830, 393);
        frame.add(new CafeWall());
        frame.setVisible(true);
    }
}