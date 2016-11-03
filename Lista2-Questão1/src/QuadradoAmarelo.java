import java.awt.*;
import javax.swing.*;

public class QuadradoAmarelo extends JPanel {
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.yellow);
        g.drawRect(10, 10, 80, 80);
    }
}
