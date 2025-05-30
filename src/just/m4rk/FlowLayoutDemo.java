package just.m4rk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FlowLayoutDemo {
    public static void createAndShowGUI() {
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton btn1 = new JButton("Кнопка 1");
        JButton btn2 = new JButton("Кнопка 2");
        JButton btn3 = new JButton("Кнопка 3");

        btn1.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Натиснута кнопка 1"));
        btn2.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Натиснута кнопка 2"));
        btn3.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Натиснута кнопка 3"));

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);

        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}
