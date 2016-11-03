import java.awt.*;
import javax.swing.*; 

public class CirculoVermelho extends JPanel{
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillOval(25, 25, 120, 120);
    }
}
