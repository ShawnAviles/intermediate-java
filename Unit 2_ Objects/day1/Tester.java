package day1;

public class Tester {
    public static void main(String[] args) {
        Point p1 = new Point (14, -2);
        Point p2 = new Point (5, 10);
        Point p3 = new Point (6, 8);

        System.out.println("Point 1: " + p1);
        p1.translate(4, -14);    
        System.out.println("Point 1: " + p1);

       // Rectangle r =  new Rectangle (12, 3, -1, 4);
        /*System.out.println(r); 
        System.out.println(r.getArea());
        r.translate(3,2);
        System.out.println(r);
        r.dilate()
        System.out.println(r);*/

        Rectangle r1 = new Rectangle(p1, p2);
        Rectangle r2 = new Rectangle(p2, p3);
        System.out.println("R1 - " + r1);
        System.out.println("R2 - " + r2);
        r1.translate(6, 4);
        System.out.println("R1 - " + r1);
        System.out.println("R2 - " + r2);

        System.out.println(r1.getArea());

    //     r.Point1(p3);
    //     System.out.println(r1.getPoint2());
    // }
    }
}