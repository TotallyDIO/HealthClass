import javax.swing.JFrame;

public class window extends JFrame {
    public window() {
        setTitle("Alcohol Drugs Smoking Game By dio");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    public static void main(String[] args) {
        new window();
    }
}