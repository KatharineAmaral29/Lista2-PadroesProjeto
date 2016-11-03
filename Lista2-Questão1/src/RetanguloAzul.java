import java.awt.*;
import javax.swing.*;

public class RetanguloAzul extends JPanel{
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.blue);
        g.drawRect(10, 10, 80, 120);
    }
}
