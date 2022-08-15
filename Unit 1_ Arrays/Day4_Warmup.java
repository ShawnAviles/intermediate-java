import java.util.Arrays;
public class Day4_Warmup {
    public static void subtractOne (int[] a) {
        for (int i=0; i < a.length; i++) {
            a[i]--;
    }
}

public static int getRandomNumber (int min, int max) {
    int x = max - min + 1; 
    int num  = (int)(x * Math.random()) + min;
    return num;
}
    public static void main(String[] args) {
        int[] myarray = {12, 34, 56, 78, 90};
        System.out.println(Arrays.toString(myarray));
        subtractOne(myarray);
        System.out.println(Arrays.toString(myarray));

        for (int i=0; i<30; i++) {
            System.out.print(getRandomNumber(3,8) + " ");
        }
    }
}