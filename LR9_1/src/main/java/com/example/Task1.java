package com.example;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Task1 extends JFrame implements ActionListener {

  public static void main(String[] args) {
    new Task1("Окно с графикой");
  }

  private JMyPanel myPanel = new JMyPanel();

  public Task1(String s) {
    super(s);
    JMenuBar menu = new JMenuBar();
    JMenu select = new JMenu("Choice");

    JMenuItem clear = new JMenuItem("CLEAR");
    clear.addActionListener(this);

    JMenuItem[] figs = new JMenuItem[4];
    for (int i = 0; i < 4; i++) {
      figs[i] = new JMenuItem(JMyPanel.Figure.values()[i].toString());
      select.add(figs[i]);
      figs[i].addActionListener(this);
    }
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(myPanel, BorderLayout.CENTER);
    Dimension size = getSize();

    size.setSize(size.width, size.height + 200);
    select.add(clear);
    menu.add(select);
    setJMenuBar(menu);
    setMinimumSize(size);
    pack();
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    myPanel.ris(e.getActionCommand());
  }
}
