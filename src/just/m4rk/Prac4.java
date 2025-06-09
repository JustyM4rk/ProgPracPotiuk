package just.m4rk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Prac4 extends JFrame {

    private JTextField textField;

    public Prac4() {
        setTitle("Приклад JToolBar");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JPanel mainPanel = new JPanel(new BorderLayout());


        JToolBar toolBar = new JToolBar();


        JButton iconButton = new JButton(new ImageIcon("C:/Users/markp/IdeaProjects/ProgPracPotiuk/src/just/m4rk/icon.png"));

        iconButton.setToolTipText("Кнопка з іконкою");
        toolBar.add(iconButton);


        toolBar.add(new JSeparator(SwingConstants.VERTICAL));


        JButton textButton = new JButton("Текстова кнопка");
        toolBar.add(textButton);


        JButton textIconButton = new JButton("Текст + Іконка", new ImageIcon("C:/Users/markp/IdeaProjects/ProgPracPotiuk/src/just/m4rk/icon.png"));
        toolBar.add(textIconButton);


        iconButton.addActionListener(e -> textField.setText("Натиснута кнопка з іконкою"));
        textButton.addActionListener(e -> textField.setText("Натиснута текстова кнопка"));
        textIconButton.addActionListener(e -> textField.setText("Натиснута кнопка з текстом і іконкою"));


        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Пункт 1", "Пункт 2", "Пункт 3"});
        comboBox.addActionListener(e -> textField.setText("Вибрано: " + comboBox.getSelectedItem()));


        textField = new JTextField();
        textField.setEditable(false);


        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem popupItem1 = new JMenuItem("Контекст 1");
        JMenuItem popupItem2 = new JMenuItem("Контекст 2");
        popupMenu.add(popupItem1);
        popupMenu.add(popupItem2);

        popupItem1.addActionListener(e -> textField.setText("Натиснуто Контекст 1"));
        popupItem2.addActionListener(e -> textField.setText("Натиснуто Контекст 2"));


        textField.setComponentPopupMenu(popupMenu);


        mainPanel.add(toolBar, BorderLayout.NORTH);
        mainPanel.add(comboBox, BorderLayout.SOUTH);
        mainPanel.add(textField, BorderLayout.CENTER);

        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> new Prac4());
    }
}
