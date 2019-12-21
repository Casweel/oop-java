package com.company;

import javax.swing.*;
import java.awt.*;

//Создать окно, реализовать анимацию, с помощью картинки, состоящей из нескольких кадров.
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("animation");
                frame.setSize(400, 228);

                JLabel jLabel = new JLabel();
                Image image = Toolkit.getDefaultToolkit().createImage("D:\\Downloads\\lab4\\src\\cat.gif");
                ImageIcon imageIcon = new ImageIcon(image);
                imageIcon.setImageObserver(jLabel);
                jLabel.setIcon(imageIcon);

                frame.add(jLabel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.setVisible(true);
            }
        });
    }
}
