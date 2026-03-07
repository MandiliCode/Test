import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("My window");
        window.setSize(720, 720);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        JTextField screen = new JTextField();
        screen.setBounds(0, 0, 400, 200);
        screen.setText("hey");
        screen.setEditable(false);
        window.add(screen, BorderLayout.NORTH);
        screen.setVisible(true);
    }

}