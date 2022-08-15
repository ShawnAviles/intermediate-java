package day4;

public class Fan {
    public static final String[] SPEEDS = {"","Slow","Medium","Fast"};
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public String toString() {
        if (on) {
            return "Speed: " + SPEEDS[speed] + "; Radius: " + radius + "; Color: " + color;
        }
        else {
            return "The fan is off; Radius: " + radius + "; Color: " + color;
        }
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn (boolean on) {
        this.on = on;
    }

}