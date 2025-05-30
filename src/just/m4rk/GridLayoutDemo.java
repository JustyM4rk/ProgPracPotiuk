package just.m4rk;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {
    public static void createAndShowGUI() {
        JFrame frame = new JFrame("GridLayout Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "=", "+", "C"
        };

        for (String text : buttons) {
            frame.add(new JButton(text));
        }

        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
