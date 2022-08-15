public class Day1_Arrayintro {
    public static void main(String [] args) {
        int[] a = new int [10];
        a[3] = 14;
        a[6] = -2;
        System.out.println(a.length);
        System.out.println(a[6]);

        for(int i=0; i<a.length; i++) {
            System.out.println (i + ": " + a[i]);
        }

        int[] b = {3, 9, 17, 2};
        System.out.println("b length: " + b.length);
        
    }
}