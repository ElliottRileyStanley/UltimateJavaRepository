package ProgrammingProjects.OpticalIllusions;

import javax.swing.*;
import java.awt.*;

public class EisensteinIllusion extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(0, 0, 0));
        for(double i = 0; i < Math.PI*2; i += 0.06) {
            g.drawLine(200, 200, (int) (Math.sin(i)*300+200), (int) (Math.cos(i)*300+200));
        }
        g.setColor(new Color(255, 0, 0));
        g.drawRect(50, 150, 100, 100);
        g.drawOval(250, 150, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("EisensteinIllusion");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.setSize(400, 400);
        frame.add(new EisensteinIllusion());
        frame.setVisible(true);
    }
}