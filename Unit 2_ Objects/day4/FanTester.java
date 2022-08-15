package day4;

public class FanTester {
    public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.setSpeed(Fan.FAST);
        f1.setRadius(10);
        f1.setColor("yellow");
        f1.setOn(true);

        Fan f2 = new Fan();
        f2.setSpeed(Fan.MEDIUM);
        
        System.out.println(f1);
        System.out.println(f2);
    }


}