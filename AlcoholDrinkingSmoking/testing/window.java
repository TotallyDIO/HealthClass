import javax.swing.JFrame;

public class window extends JFrame {
    public window() {
        setTitle("Alcohol Drugs Smoking Game By Hunter");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new window();
    }
}