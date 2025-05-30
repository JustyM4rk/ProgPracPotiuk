package just.m4rk;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemo {
    public static void createAndShowGUI() {
        JFrame frame = new JFrame("BoxLayout Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JTextField firstName = new JTextField(15);
        JTextField lastName = new JTextField(15);
        JTextField age = new JTextField(5);
        JButton submit = new JButton("Надіслати");

        panel.add(new JLabel("Ім'я:"));
        panel.add(firstName);
        panel.add(Box.createVerticalStrut(10));
        panel.add(new JLabel("Прізвище:"));
        panel.add(lastName);
        panel.add(Box.createVerticalStrut(10));
        panel.add(new JLabel("Вік:"));
        panel.add(age);
        panel.add(Box.createVerticalStrut(10));
        panel.add(submit);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
