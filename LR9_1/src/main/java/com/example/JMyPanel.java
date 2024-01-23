package com.example;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

public class JMyPanel extends JPanel {

  public static enum Figure {
    LINE,
    OVAL,
    RECT,
    ROUNDRECT,
    CLEAR,
  }

  private Figure vibor = Figure.CLEAR;

  public JMyPanel() {}

  public void ris(String s) {
    vibor = Figure.valueOf(s);
    repaint();
  }

  public void paintComponent(Graphics gr) {
    super.paintComponent(gr);
    Graphics2D g = (Graphics2D) gr;
    BasicStroke pen;
    g.setRenderingHint(
      RenderingHints.KEY_ANTIALIASING,
      RenderingHints.VALUE_ANTIALIAS_ON
    );
    switch (vibor) {
      case LINE:
        pen =
          new BasicStroke(20, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        g.setStroke(pen);
        g.setColor(Color.blue);
        g.drawLine(20, 20, 100, 100);
        break;
      case OVAL:
        float[] dash = { 10, 30 };
        pen =
          new BasicStroke(
            10,
            BasicStroke.CAP_SQUARE,
            BasicStroke.JOIN_ROUND,
            10,
            dash,
            0
          );
        g.setStroke(pen);
        g.setColor(Color.red);
        g.setPaint(
          new GradientPaint(30, 30, Color.red, 50, 50, Color.green, true)
        );
        g.fill(new Ellipse2D.Double(20, 20, 100, 100));
        break;
      case RECT:
        float[] dash2 = { 20, 20 };
        pen =
          new BasicStroke(
            5,
            BasicStroke.CAP_SQUARE,
            BasicStroke.JOIN_BEVEL,
            1,
            dash2,
            0
          );
        g.setStroke(pen);
        g.setColor(Color.magenta);
        g.drawRect(20, 20, 100, 100);
        break;
      case ROUNDRECT:
        float[] dash3 = { 20, 20, 2, 20, 2, 20 };
        pen =
          new BasicStroke(
            10,
            BasicStroke.CAP_ROUND,
            BasicStroke.JOIN_BEVEL,
            1,
            dash3,
            0
          );
        g.setStroke(pen);
        g.setColor(Color.yellow);
        g.drawRoundRect(20, 20, 100, 100, 60, 60);
        break;
      case CLEAR:
        g.clearRect(0, 0, getSize().width, getSize().height);
        break;
    }
  }
}
