package just.m4rk;

public class Prac4Launch {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
             FlowLayoutDemo.createAndShowGUI();
            // GridLayoutDemo.createAndShowGUI();
            // CardLayoutDemo.createAndShowGUI();
            // BoxLayoutDemo.createAndShowGUI();
        });
    }
}
