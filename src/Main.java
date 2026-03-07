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

        buttonLayout b1 = new buttonLayout("one");
        buttonsContainer.add(b1);
        buttonLayout b2 = new buttonLayout("one");
        buttonsContainer.add(b2);
        buttonLayout b3 = new buttonLayout("one");
        buttonsContainer.add(b3);
        buttonLayout b4 = new buttonLayout("one");
        buttonsContainer.add(b4);
        buttonLayout b5 = new buttonLayout("one");
        buttonsContainer.add(b5);
        buttonLayout b6 = new buttonLayout("one");
        buttonsContainer.add(b6);
        buttonLayout b7 = new buttonLayout("one");
        buttonsContainer.add(b7);
        buttonLayout b8 = new buttonLayout("one");
        buttonsContainer.add(b8);
        buttonLayout b9 = new buttonLayout("one");
        buttonsContainer.add(b9);
        buttonLayout b10 = new buttonLayout("one");
        buttonsContainer.add(b10);
        buttonLayout b11 = new buttonLayout("one");
        buttonsContainer.add(b11);
        buttonLayout b12 = new buttonLayout("one");
        buttonsContainer.add(b12);
        buttonLayout b13 = new buttonLayout("one");
        buttonsContainer.add(b13);
        buttonLayout b14 = new buttonLayout("one");
        buttonsContainer.add(b14);
        buttonLayout b15 = new buttonLayout("one");
        buttonsContainer.add(b15);
        buttonLayout b16 = new buttonLayout("one");
        buttonsContainer.add(b16);

        window.setVisible(true);
        screen.setVisible(true);
        buttonsContainer.setVisible(true);

    }

}