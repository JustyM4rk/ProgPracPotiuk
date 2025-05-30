package just.m4rk;

import javax.swing.*;
import java.awt.*;

public class CardLayoutDemo {
    public static void createAndShowGUI() {
        JFrame frame = new JFrame("CardLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CardLayout cardLayout = new CardLayout();
        JPanel cards = new JPanel(cardLayout);

        JPanel card1 = new JPanel();
        card1.add(new JLabel("Ласкаво просимо!"));
        JButton next1 = new JButton("До реєстрації");
        card1.add(next1);

        JPanel card2 = new JPanel();
        card2.setLayout(new BoxLayout(card2, BoxLayout.Y_AXIS));
        JTextField name = new JTextField(15);
        JTextField email = new JTextField(15);
        card2.add(new JLabel("ПІБ:"));
        card2.add(name);
        card2.add(new JLabel("Email:"));
        card2.add(email);
        JButton next2 = new JButton("Далі");
        card2.add(next2);

        JPanel card3 = new JPanel();
        card3.add(new JLabel("Дякуємо за реєстрацію!"));

        cards.add(card1, "card1");
        cards.add(card2, "card2");
        cards.add(card3, "card3");

        next1.addActionListener(e -> cardLayout.show(cards, "card2"));
        next2.addActionListener(e -> cardLayout.show(cards, "card3"));

        frame.add(cards);
        frame.setSize(400, 250);
        frame.setVisible(true);
    }
}
