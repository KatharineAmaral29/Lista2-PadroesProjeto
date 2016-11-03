import java.awt.*;
import javax.swing.*;

public class CirculoAmarelo extends JPanel{
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.yellow);
        g.fillOval(25, 25, 120, 120);
    }
}
