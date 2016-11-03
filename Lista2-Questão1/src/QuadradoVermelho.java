import java.awt.*;
import javax.swing.*;

public class QuadradoVermelho extends JPanel{
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawRect(10, 10, 80, 80);
    }
}
