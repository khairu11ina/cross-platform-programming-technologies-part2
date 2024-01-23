package com.example;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

class LastNamePanel extends JPanel {

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Буква "K"
    g.setColor(Color.MAGENTA);
    g.fillArc(50, 50, 100, 100, -90, 180);
    g.setColor(Color.GREEN);
    g.fillArc(75, 75, 50, 50, -90, 180);
    g.drawLine(100, 50, 100, 220);

    // Буква "H"
    g.setColor(Color.MAGENTA);
    g.fillRect(150, 50, 20, 170);
    g.fillRect(150, 110, 100, 20);
    g.setColor(Color.GREEN);
    g.fillRect(170, 90, 60, 20);

    // Буква "A"
    g.setColor(Color.MAGENTA);
    int[] xPoints = { 250, 225, 275 };
    int[] yPoints = { 50, 150, 150 };
    g.fillPolygon(xPoints, yPoints, 3);
    g.setColor(Color.GREEN);
    g.drawLine(235, 90, 265, 90);

    // Буква "Y"
    g.setColor(Color.MAGENTA);
    g.fillArc(300, 50, 100, 100, -90, 180);
    g.setColor(Color.GREEN);
    g.fillArc(325, 75, 50, 50, -90, 180);
    g.drawLine(350, 50, 350, 220);

    // Буква "R"
    g.setColor(Color.MAGENTA);
    g.fillRect(400, 50, 20, 170);
    g.setColor(Color.GREEN);
    g.fillArc(425, 50, 50, 50, -90, 180);
    g.drawLine(450, 100, 450, 150);
    g.drawLine(450, 100, 475, 100);

    // Буква "U"
    g.setColor(Color.MAGENTA);
    g.fillRect(500, 50, 20, 120);
    g.fillArc(500, 120, 100, 100, -180, 180);
    g.setColor(Color.GREEN);
    g.drawLine(525, 50, 525, 170);
    g.drawLine(525, 170, 600, 170);

    // Буква "L"
    g.setColor(Color.MAGENTA);
    g.fillRect(650, 50, 20, 170);
    g.fillRect(650, 170, 100, 20);

    // Буква "L"
    g.setColor(Color.MAGENTA);
    g.fillRect(750, 50, 20, 170);
    g.fillRect(750, 170, 100, 20);

    // Буква "I"
    g.setColor(Color.MAGENTA);
    g.fillRect(850, 50, 20, 170);

    // Буква "N"
    g.setColor(Color.MAGENTA);
    g.fillRect(150, 50, 20, 170);
    g.fillRect(150, 110, 100, 20);
    g.setColor(Color.GREEN);
    g.fillRect(170, 90, 60, 20);

    // Буква "A"
    g.setColor(Color.MAGENTA);
    g.fillPolygon(xPoints, yPoints, 3);
    g.setColor(Color.GREEN);
    g.drawLine(235, 90, 265, 90);
  }
}
