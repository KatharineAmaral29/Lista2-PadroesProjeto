import java.awt.*;
import javax.swing.*;

public class CirculoAzul extends JPanel {
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.blue);
        g.fillOval(25, 25, 120, 120);
    }
}
