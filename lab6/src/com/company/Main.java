package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


class Secret extends JFrame {
    int i = 2;
    JLabel lbl = new JLabel("Угадайте число между 0 и 20.");
    JTextField jta = new JTextField(2);
    JButton button = new JButton("Попробовать");
    int k = (int) Math.random() * 21;

    Secret() {
        super("угадай-ка");
        setSize(400, 100);
        setLayout(new GridLayout(2, 3));
        add(lbl);
        add(jta);
        add(button);
        button.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    int x = Integer.parseInt(jta.getText().trim());
                    i--;
                    if (k == x) {
                        JOptionPane.showMessageDialog(null, "Верно");
                        dispose();
                    } else if (i == 0) {
                        JOptionPane.showMessageDialog(null, "Неверно, это была последняя попытка");
                        dispose();
                    } else if (k < x) {
                        JOptionPane.showMessageDialog(null, "Неверно, осталось " + (i + 1) + " попыток. Число меньше " + x);
                    } else {
                        JOptionPane.showMessageDialog(null, "Неверно, осталось " + (i + 1) + " попыток. Число больше " + x);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Число введено некорректно", "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }
}

public class Main {

    public static void main(String[] args) {
        new Secret();
    }
}
/*Реализуйте игру-угадайку, которая имеет одно текстовое поле и одну кнопку.
Он предложит пользователю угадать число между 0-20 и дает ему три попытки.
Если ему не удастся угадать, то будет выведено сообщение,
что пользователь допустил ошибку в угадывнии и что число меньше / больше.
Если пользователь попытался три раза угадать, то программу завершается с
соответствующим сообщением. Если пользовательугадал, то программа должна
тоже завершаться с соответствующим сообщением.*/