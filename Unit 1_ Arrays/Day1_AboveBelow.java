import java.util.Scanner;

public class Day1_AboveBelow {
    public static void main (final String [] args) {
        final Scanner input = new Scanner (System.in);
        System.out.println ("How many numbers?");
        final int size = input.nextInt();

        final int[] nums = new int[size];
        System.out.println("Enter the numbers.");
        for (int i = 0; i <size; i++) {
            nums[i] = input.nextInt();
        }
        input.close();
    }
}