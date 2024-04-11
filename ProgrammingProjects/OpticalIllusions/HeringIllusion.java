package ProgrammingProjects.OpticalIllusions;

import javax.swing.*;
import java.awt.*;

public class HeringIllusion extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(0, 0, 0));
        for (double i = 0; i < Math.PI*2; i += 0.06) {
            g.drawLine(200, 200, (int) (Math.sin(i)*300+200), (int) (Math.cos(i)*300+200));
        }
        g.setColor(new Color(255, 0, 0));
        g.drawLine(150, 0, 150, 400);
        g.drawLine(250, 0, 250, 400);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HeringIllusion");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.setSize(400, 400);
        frame.add(new HeringIllusion());
        frame.setVisible(true);
    }
}