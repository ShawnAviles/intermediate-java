package day1;

public class Rectangle {
    private Point p1; //private command thingie makes sure no one else can touch the code 
    private Point p2;

    public Rectangle(double x1, double y1, double x2, double y2) {
        p1 = new Point (x1, y1);
        p2 = new Point (x2, y2);
    }

    public Rectangle(Point p1, Point p2) {
        this.p1 = new Point(p1.x, p1.y);
        this.p2 = new Point(p2.x, p2.y);

    }

    public String toString() {
        return "Rectangle: " + p1 + "; " + p2;
    }

    public double getWidth() {
        return Math.abs(p1.x - p2.x);
    }

    public double getHeight() {
        return Math.abs(p1.y - p2.y);
    }

    public double getArea() {
        return getWidth() * getHeight();
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public void translate(int dx, int dy){
        p1.translate(dx, dy);
        p2.translate(dx, dy);
    }

    public void dialte (double factor) {
        p1.dilate(factor);
        p2.dilate(factor);
    }

    public Point getPoint1() {
        return new Point (p1.x, p1.y);
    }

    public Point getPoint2() {
        return new Point (p2.x, p2.y);
    }

    public void setPoint1() {
        this.p1 = new Point (p1.x, p1.y);
    }
    
    public void setPoint2() {
        this.p2 = new Point (p2.x, p2.y);
    }
}