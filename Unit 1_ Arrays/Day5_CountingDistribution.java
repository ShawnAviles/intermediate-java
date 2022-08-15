import java.util.Scanner;

public class Day5_CountingDistribution {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] nums = new int[11];

        System.out.println("Enter numbers between 1 and 10 inclusive, ending with a 0");
        
        int n = input.nextInt();
        while (n != 0) {
            nums[n]++;
            n = input.nextInt();
        }
        for (int i=1; i<= 10; i++){
            if (nums[i] == 1){
                System.out.println(i + ": " + nums[i] + " time");
            }
            else if (nums[i] > 1) {
                System.out.println(i + ": " + nums[i] + " times");
            }
        }
        input.close();

    }
}
