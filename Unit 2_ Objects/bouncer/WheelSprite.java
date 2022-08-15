package bouncer;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class WheelSprite extends CircleSprite{
    private int radius2;

    public WheelSprite (JPanel panel, int dx, int dy, int radius, Color color){
        super(panel, dx, dy, radius, color);
        radius2 = radius - 5;
        this.color = color;
    }

    public void paint(Graphics g){
        super.paint(g);
        g.setColor(panel.getBackground());
        g.fillOval(x-radius2, y-radius2, radius2*2, radius2*2);
    }
}