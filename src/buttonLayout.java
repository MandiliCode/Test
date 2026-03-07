import javax.swing.JButton;

import java.awt.Font;

public class buttonLayout extends JButton {
    // Constructors...
    public buttonLayout(String name) {
        super(name);
        this.setFont(new Font("Arial", Font.BOLD, 30));
        this.setFocusable(false);
    }

}
