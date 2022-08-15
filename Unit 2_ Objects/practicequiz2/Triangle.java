package practicequiz2;

public class Triangle{

    private double s1;
    private double s2;
    private double s3;

    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public Triangle(double s) {
        this.s1 = s;
        this.s2 = s;
        this.s3 = s;
    }

    public boolean isScalene(){
        if (s1 != s2 && s2 != s3 && s1 != s3)
            return true;
        else {
            return false;
        } 
    }

    public boolean isIsosceles(){
        if (s1 == s2 || s2 == s3 || s1 == s3){
            return true;
        }
        else {
            return false; 
        }
    }

    public double getPerimeter() {
        return s1 + s2 + s3;
    }

    public void dilate (double factor){
        s1 *= factor;
        s2 *= factor;
        s3 *= factor;
    }

    public boolean isCongruent(Triangle t){
        return (t.s1 == s1) && (t.s2 == s2) && (t.s3 == s3);
    }

    public String toString () {
        return String.format (
                "Triangle:\n" +
                "\tSide 1: %.1f\n" +
                "\tSide 2: %.1f\n" +
                "\tSide 3: %.1f\n", 
                s1, s2, s3);
    }

    public void setS1(double s1){
        this.s1 = s1; 
    }

    public void setS2(double s2){
        this.s2 = s2; 
    }

    public void setS3(double s3){
        this.s3 = s3; 
    }

    public double getS1 (){
        return s1; 
    }

    public double getS2 (){
        return s2; 
    }

    public double getS3 (){
        return s3; 
    }
}