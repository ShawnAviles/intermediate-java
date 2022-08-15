public class Day2_RandomGen {
    public static void main(String [] args) {
        for (int i=0; i<20; i++) {
            int num = (int)(Math.random() * 30);
            System.out.println(num); 
        }
    }
}