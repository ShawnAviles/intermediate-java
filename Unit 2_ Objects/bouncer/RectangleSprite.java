package bouncer;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class RectangleSprite extends Sprite{
    private int width;
    private int height;
    protected Color color;

    public RectangleSprite(JPanel panel, int dx, int dy, int width, int height, Color color){
        super (panel, dx, dy);
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getLeft() {
        return x - width/2;
    }

    public int getRight() {
        return x + width/2;
    }

    public int getTop() {
        return y - height/2;
    }

    public int getBottom() {
        return y + height/2;
    }

    public void paint (Graphics g){
        g.setColor (color);
        g.fillRect(getLeft(), getTop(), width, height); 
    }
}