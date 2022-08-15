import java.util.Scanner;

public class Day3_Distinct {
    public static void main(String [] args) {
        Scanner input = new Scanner (System.in);
        int[] a = new int[10];
        int size = 0;

        System.out.println ("Enter 10 numbers.");
        for (int i=0; i < 10; i++) {
            int num =  input.nextInt();

            boolean flag = false;
            for (int j=0; j<size; j++) {
                if (a[j] == num) {
                    flag = true; 
                }
            }
            if (flag == false) {
                a[size] = num;
                size += 1;
            } 
        }
        for (int i=0; i<size; i++) {
            System.out.print(a[i] + "  ");
        }
        input.close();
    }
}
    