import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.*;
import javax.swing.JPanel;

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
        buttonsContainer.setLayout(new GridLayout(4, 4));
        window.add(buttonsContainer, BorderLayout.SOUTH);

        String[] buttonNames = { "1", "2", "3", "4", "5", "6",
                "7", "8", "9", "=", "+", "-", "x", "÷"
        };

        for (int i = 0; i < buttonNames.length; i++) {
            String name = buttonNames[i];
            buttonLayout button = new buttonLayout(name);
            buttonsContainer.add(button);
        }

        window.setVisible(true);
        screen.setVisible(true);
        buttonsContainer.setVisible(true);

    }

}