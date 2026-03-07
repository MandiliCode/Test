import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.*;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main implements ActionListener {
    JTextField screen;

    public static void main(String[] args) {
        JFrame window = new JFrame("My window");
        window.setSize(720, 720);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Main theListener = new Main();

        theListener.screen = new JTextField();
        theListener.screen.setBounds(0, 0, 400, 200);
        theListener.screen.setText("hey");
        theListener.screen.setEditable(false);
        window.add(theListener.screen, BorderLayout.NORTH);

        JPanel buttonsContainer = new JPanel();
        buttonsContainer.setLayout(new GridLayout(4, 4));
        window.add(buttonsContainer, BorderLayout.SOUTH);

        String[] buttonNames = { "1", "2", "3", "4", "5", "6",
                "7", "8", "9", "=", "+", "-", "x", "÷", "del"
        };
        for (int i = 0; i < buttonNames.length; i++) {
            String name = buttonNames[i];
            buttonLayout button = new buttonLayout(name);
            buttonsContainer.add(button);
            button.addActionListener(theListener);
        }

        window.setVisible(true);
        theListener.screen.setVisible(true);
        buttonsContainer.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());

        String button = e.getActionCommand();

        screen.setText(button);
    }

}