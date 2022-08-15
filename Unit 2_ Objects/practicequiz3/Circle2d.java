package practicequiz3;

public class Circle2d {

    private double x;
    private double y;
    private double radius = 1;

    public Circle2d(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;    
    }

    public Circle2d(double x, double y){
        this.x = x;
        this.y = y;  
    }

    public double getArea(){
        return Math.PI * (radius * radius);
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public void translate(double dx, double dy){
        x += dx;
        y += dy;
    }

    public void expand(double amt){
        radius += amt;
    }

    public double distance(Circle2d other){
        double in = Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2);
        return Math.pow((in), 0.5);
    }

    public boolean contains(double x, double y){
        double dist = Math.pow(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2), 0.5);
        if (dist > radius){
            return false;
        }
        else {
            return true;
        }
    }

    public String toString(){
        return String.format("Circle: (%.1f, %.1f); Radius: %.1f", x, y, radius);
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getRadius(){
        return radius;
    }

}