import javax.swing.JButton;

import java.awt.Font;
import java.awt.font.*;

public class buttonLayout extends JButton {
    // Constructors...
    public buttonLayout(String name) {
        super(name);

        this.setFont(new Font("Arial", Font.BOLD, 20));
        this.setFocusable(false);
    }

}
