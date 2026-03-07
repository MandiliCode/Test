import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("My window");
        window.setSize(720, 720);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField screen = new JTextField();
        screen.setBounds(0, 0, 400, 200);
        screen.setText("hey");
        screen.setEditable(false);
        window.add(screen, BorderLayout.NORTH);

        JPanel buttonsContainer = new JPanel();
        buttonsContainer.setLayout(new GridLayout(2, 2));
        window.add(buttonsContainer, BorderLayout.SOUTH);

        window.setVisible(true);
        screen.setVisible(true);
        buttonsContainer.setVisible(true);

    }

}