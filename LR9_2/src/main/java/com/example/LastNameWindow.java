package com.example;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

class LastNameWindow extends JFrame {

  public LastNameWindow(String title) {
    super(title);
    setSize(850, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    JMenuBar menuBar = new JMenuBar();
    /* JMenu colorMenu = new JMenu("Выбрать цвет"); */
    JMenu clearMenu = new JMenu("Очистить");
    /* menuBar.add(colorMenu); */
    menuBar.add(clearMenu);
    // on click clearMenu clear window
    clearMenu.addMouseListener(
      new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
          getContentPane().removeAll();
          getContentPane().repaint();
        }
      }
    );
    add(menuBar, BorderLayout.NORTH);
    // draw last name
    add(new LastNamePanel());

    setVisible(true);
  }
}
